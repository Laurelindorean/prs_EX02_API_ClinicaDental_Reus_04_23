/**
 * 
 */
package com.crud.mysql.service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.crud.mysql.dao.IPatientDAO;
import com.crud.mysql.model.dto.patient.PatientDTO;
import com.crud.mysql.model.dto.patient.RequestCreatePatientDTO;
import com.crud.mysql.model.dto.patient.RequestUpdatePatientDTO;
import com.crud.mysql.model.entity.Patient;

/**
 * @author Palmira
 *
 */
@Service
public class PatientService implements IPatientService {

	@Autowired
	private IPatientDAO patientDAO;

	@Override
	public PatientDTO createPatient(RequestCreatePatientDTO request) {
		this.validateRequest(request);
		Patient patientEntity = new Patient();
		patientEntity.setDni(request.getDni());
		patientEntity.setNameSurname(request.getNameSurname());
		patientEntity.setMail(request.getMail());
		patientEntity.setPsw(request.getPsw());

		this.patientDAO.save(patientEntity);

		return this.mapEntityToDTO(patientEntity);
	}

	@Override
	public PatientDTO patientById(int id) {
		return this.mapEntityToDTO(this.patientDAO.findById(id).orElseThrow());
	}

	@Override
	public List<PatientDTO> listPatient() {
		List<PatientDTO> listPatientDTO = new ArrayList<>();
		this.patientDAO.findAll().forEach(patient -> listPatientDTO.add(this.mapEntityToDTO(patient)));
		return listPatientDTO;
	}

	@Override
	public PatientDTO updatePatient(RequestUpdatePatientDTO patient) {
		try {
			Patient patientEntity = this.patientDAO.findById(patient.getId()).orElseThrow();

			//We use this to validate if the user is allowed to make changes
			if (!patientEntity.getPsw().equals(patient.getOldPsw())) {
				throw new RuntimeException("Wrong password");
			}

			patientEntity.setDni(patient.getDni());
			patientEntity.setMail(patient.getMail());
			patientEntity.setNameSurname(patient.getNameSurname());
			patientEntity.setPsw(patient.getNewPsw());
			this.patientDAO.save(patientEntity);

			return this.mapEntityToDTO(patientEntity);
		} catch (NoSuchElementException e) {
			throw new RuntimeException("Not found user");
		}
	}

	@Override
	public void deletePatient(int id) {
		patientDAO.deleteById(id);
	}

	//A validation to check if one of the camps are blank
	private void validateRequest(RequestCreatePatientDTO request) {
		if (!StringUtils.hasText(request.getDni())) {
			throw new RuntimeException("DNI is mandatory");
		}

		if (!StringUtils.hasText(request.getMail())) {
			throw new RuntimeException("Email is mandatory");
		}

		if (!StringUtils.hasText(request.getNameSurname())) {
			throw new RuntimeException("Name is mandatory");
		}

		if (!StringUtils.hasText(request.getPsw())) {
			throw new RuntimeException("Password is mandatory");
		}
	}

	private PatientDTO mapEntityToDTO(Patient patientEntity) {
		PatientDTO patientDTO = new PatientDTO();

		patientDTO.setId(patientEntity.getId());
		patientDTO.setNameSurname(patientEntity.getNameSurname());
		patientDTO.setDni(patientEntity.getDni());
		patientDTO.setMail(patientEntity.getMail());

		return patientDTO;
	}
}