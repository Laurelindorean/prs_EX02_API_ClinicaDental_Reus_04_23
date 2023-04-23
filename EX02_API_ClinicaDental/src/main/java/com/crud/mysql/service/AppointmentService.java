/**
 * 
 */
package com.crud.mysql.service;

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
import com.crud.mysql.model.dto.dentist.RequestInfoDentist;
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
	public List<AppointmentUserDTO> findAppointmentByPatientDni(String patient_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AppointmentDentistDTO> findAppointmentByDentistId(int dentist_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AppointmentDTO> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AppointmentDTO findAppointmentById(int idAppointment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AppointmentUserDTO updateAppoitment(int idAppointment, RequestUpdateAppointmentDTO request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AppointmentUserDTO deleteAppoitment(int idAppointment) {
		// TODO Auto-generated method stub
		return null;
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
}
