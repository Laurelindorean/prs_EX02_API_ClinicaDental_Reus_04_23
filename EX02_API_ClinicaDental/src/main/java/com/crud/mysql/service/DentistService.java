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

import com.crud.mysql.dao.IDentistDAO;
import com.crud.mysql.model.dto.dentist.DentistDTO;
import com.crud.mysql.model.dto.dentist.RequestCreateDentistDTO;
import com.crud.mysql.model.dto.dentist.RequestUpdateDentistDTO;
import com.crud.mysql.model.entity.Dentist;

/**
 * @author Palmira
 *
 */
@Service
public class DentistService implements IDentistService {

	@Autowired
	private IDentistDAO dentistDAO;

	@Override
	public List<DentistDTO> listDentist() {
		List<DentistDTO> listDentistDto = new ArrayList<>();
		this.dentistDAO.findAll().forEach(dentist -> listDentistDto.add(this.mapEntityToDTO(dentist)));
		return listDentistDto;
	}

	@Override
	public DentistDTO createDentist(RequestCreateDentistDTO request) {
		this.validateRequest(request);
		Dentist dentistEntity = new Dentist();
		dentistEntity.setDni(request.getDni());
		dentistEntity.setNameSurname(request.getNameSurname());
		dentistEntity.setMail(request.getMail());
		dentistEntity.setPsw(request.getPsw());
		dentistEntity.setSpeciality(request.getSpeciality());
		this.dentistDAO.save(dentistEntity);
		return this.mapEntityToDTO(dentistEntity);
	}

	@Override
	public DentistDTO dentistById(int id) {
		return this.mapEntityToDTO(this.dentistDAO.findById(id).orElseThrow());
	}

	@Override
	public DentistDTO updateDentist(RequestUpdateDentistDTO dentist) {
		try {
			Dentist dentistEntity = this.dentistDAO.findById(dentist.getId()).orElseThrow();
			// We use this to validate if the user is allowed to make changes
			if (!dentistEntity.getPsw().equals(dentist.getOldPsw())) {
				throw new RuntimeException("Wrong password");
			}
			dentistEntity.setDni(dentist.getDni());
			dentistEntity.setNameSurname(dentist.getNameSurname());
			dentistEntity.setMail(dentist.getMail());
			dentistEntity.setPsw(dentist.getNewPsw());
			dentistEntity.setSpeciality(dentist.getSpeciality());
			this.dentistDAO.save(dentistEntity);
			return this.mapEntityToDTO(dentistEntity);
		} catch (NoSuchElementException e) {
			throw new RuntimeException("User not found");
		}
	}

	@Override
	public DentistDTO findByNameSurname(String nameSurname) {
		return this.mapEntityToDTO(this.dentistDAO.findByNameSurname(nameSurname));

	}

	@Override
	public void deleteDentist(int id) {
		dentistDAO.deleteById(id);

	}

	private DentistDTO mapEntityToDTO(Dentist dentistEntity) {
		DentistDTO dentistDTO = new DentistDTO();
		dentistDTO.setId(dentistEntity.getId());
		dentistDTO.setNameSurname(dentistEntity.getNameSurname());
		dentistDTO.setDni(dentistEntity.getDni());
		dentistDTO.setMail(dentistEntity.getMail());
		dentistDTO.setSpeciality(dentistEntity.getSpeciality());
		return dentistDTO;
	}

	// A validation to check if one of the camps are blank
	private void validateRequest(RequestCreateDentistDTO request) {
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
		if (!StringUtils.hasText(request.getSpeciality())) {
			throw new RuntimeException("Speciality is mandatory");
		}
	}

}
