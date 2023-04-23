/**
 * 
 */
package com.crud.mysql.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.mysql.dao.IAppointmentDAO;
import com.crud.mysql.dao.IDentistDAO;
import com.crud.mysql.dao.IPatientDAO;
import com.crud.mysql.model.dto.appointment.AppointmentDTO;
import com.crud.mysql.model.dto.appointment.AppointmentDentistDTO;
import com.crud.mysql.model.dto.appointment.AppointmentUserDTO;
import com.crud.mysql.model.dto.appointment.RequestCreateAppointmentDTO;
import com.crud.mysql.model.dto.appointment.RequestUpdateAppointmentDTO;
import com.crud.mysql.model.dto.dentist.DentistDTO;
import com.crud.mysql.model.dto.dentist.RequestInfoDentist;
import com.crud.mysql.model.dto.patient.PatientDTO;
import com.crud.mysql.model.entity.Appointment;
import com.crud.mysql.model.entity.Dentist;
import com.crud.mysql.model.entity.Patient;

/**
 * @author Palmira
 *
 */
@Service
public class AppointmentService implements IAppointmentService {

	@Autowired
	private IAppointmentDAO appointmentDAO;
	@Autowired
	private IPatientDAO patientDAO;
	@Autowired
	private IDentistDAO dentistDAO;

	@Override
	public AppointmentUserDTO createAppointment(int idUser, RequestCreateAppointmentDTO request) {
		Appointment appointmentEntity = new Appointment();

		appointmentEntity.setDateAppointment(request.getDateAppointment());

		Patient patientEntity = this.patientDAO.findById(idUser).orElseThrow();
		Dentist dentistEntity = this.dentistDAO.findById(request.getIdDentist()).orElseThrow();

		appointmentEntity.setPatient(patientEntity);
		appointmentEntity.setDentist(dentistEntity);
		appointmentEntity = this.appointmentDAO.save(appointmentEntity);

		return this.mapAppointmentUserDTO(appointmentEntity);
	}

	@Override
	public List<AppointmentUserDTO> findAppointmentByPatientDni(String dni) {
		return this.appointmentDAO.findAppointmentByPatientDni(dni);
	}

	@Override
	public List<AppointmentDentistDTO> findAppointmentByDentistId(int dentist_id) {

		List<Appointment> listAppointment = this.appointmentDAO.findAppointmentByDentistId(dentist_id);
		List<AppointmentDentistDTO> listAppointmentDTO = new ArrayList<>();
		for (Appointment appointmentEntity : listAppointment) {
			listAppointmentDTO.add(this.mapAppointmentDentistDTO(appointmentEntity));
		}
		return listAppointmentDTO;
	}

	@Override
	public List<AppointmentDTO> list() {
		List<AppointmentDTO> listAppointmentDto = new ArrayList<>();
		this.appointmentDAO.findAll()
				.forEach(appointment -> listAppointmentDto.add(this.mapAppointmentDTO(appointment)));
		return listAppointmentDto;
	}

	@Override
	public AppointmentDTO findAppointmentById(int idAppointment) {
		return this.mapAppointmentDTO(this.appointmentDAO.findById(idAppointment).orElseThrow());
	}

	@Override
	public AppointmentUserDTO updateAppoitment(int idUser, RequestUpdateAppointmentDTO request) {
		Appointment appointmentEntity = this.appointmentDAO.findById(request.getIdAppointment()).orElseThrow();
		if (appointmentEntity.getPatient().getId() == idUser
				&& appointmentEntity.getPatient().getPsw().equals(request.getPsw())) {
			appointmentEntity.setDateAppointment(request.getNewDate());
			appointmentEntity.setDentist(this.dentistDAO.findById(request.getIdDentist()).orElseThrow());
			this.appointmentDAO.save(appointmentEntity);
		}else {
			throw new RuntimeException("Wrong user or password");
		}

		return this.mapAppointmentUserDTO(appointmentEntity);
	}

	@Override
	public void deleteAppoitment(int idAppointment) {
		this.appointmentDAO.deleteById(idAppointment);
	}

	private AppointmentDentistDTO mapAppointmentDentistDTO(Appointment appointmentEntity) {
		AppointmentDentistDTO appointmentDTO = new AppointmentDentistDTO();
		PatientDTO patientDTO = this.mapPatientDTO(appointmentEntity.getPatient());
		appointmentDTO.setId(appointmentEntity.getId());
		appointmentDTO.setDateAppointment(appointmentEntity.getDateAppointment());
		appointmentDTO.setPatientDTO(patientDTO);
		return appointmentDTO;
	}

	private AppointmentUserDTO mapAppointmentUserDTO(Appointment appointmentEntity) {
		AppointmentUserDTO appointmentDTO = new AppointmentUserDTO();
		RequestInfoDentist infoDentistDTO = new RequestInfoDentist();

		appointmentDTO.setId(appointmentEntity.getId());
		appointmentDTO.setDateAppointment(appointmentEntity.getDateAppointment());
		appointmentDTO.setInfoDentist(infoDentistDTO);
		infoDentistDTO.setId(appointmentEntity.getDentist().getId());
		infoDentistDTO.setMail(appointmentEntity.getDentist().getMail());
		infoDentistDTO.setNameSurname(appointmentEntity.getDentist().getNameSurname());
		infoDentistDTO.setSpeciality(appointmentEntity.getDentist().getSpeciality());

		return appointmentDTO;
	}

	private AppointmentDTO mapAppointmentDTO(Appointment appointment) {
		AppointmentDTO appointmentDTO = new AppointmentDTO();
		PatientDTO patientDTO = this.mapPatientDTO(appointment.getPatient());
		DentistDTO dentistDTO = this.mapDentistDTO(appointment.getDentist());

		appointmentDTO.setId(appointment.getId());
		appointmentDTO.setDateAppointment(appointment.getDateAppointment());
		appointmentDTO.setDentistDTO(dentistDTO);
		appointmentDTO.setPatientDTO(patientDTO);

		return appointmentDTO;
	}

	private DentistDTO mapDentistDTO(Dentist dentist) {
		DentistDTO dentistDTO = new DentistDTO();
		dentistDTO.setId(dentist.getId());
		dentistDTO.setDni(dentist.getDni());
		dentistDTO.setNameSurname(dentist.getNameSurname());
		dentistDTO.setMail(dentist.getMail());
		dentistDTO.setSpeciality(dentist.getSpeciality());

		return dentistDTO;
	}

	private PatientDTO mapPatientDTO(Patient patientEntity) {
		PatientDTO patientDTO = new PatientDTO();
		patientDTO.setId(patientEntity.getId());
		patientDTO.setDni(patientEntity.getDni());
		patientDTO.setMail(patientEntity.getMail());
		patientDTO.setNameSurname(patientEntity.getNameSurname());

		return patientDTO;
	}
}
