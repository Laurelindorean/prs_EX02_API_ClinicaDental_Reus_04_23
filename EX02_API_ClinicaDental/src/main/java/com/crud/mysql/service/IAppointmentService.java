/**
 * 
 */
package com.crud.mysql.service;

import java.util.List;

import com.crud.mysql.model.dto.appointment.AppointmentDTO;
import com.crud.mysql.model.dto.appointment.AppointmentDentistDTO;
import com.crud.mysql.model.dto.appointment.AppointmentUserDTO;
import com.crud.mysql.model.dto.appointment.RequestCreateAppointmentDTO;
import com.crud.mysql.model.dto.appointment.RequestUpdateAppointmentDTO;

/**
 * @author Palmira
 *
 */
public interface IAppointmentService {

	//CRUD Methods
	public List<AppointmentUserDTO> findAppointmentByPatientDni(String dni);
	
	public List<AppointmentDentistDTO> findAppointmentByDentistId(int dentist_id);
	
	public List<AppointmentDTO> list();
	
	public AppointmentDTO findAppointmentById(int idAppointment);
	
	public AppointmentUserDTO createAppointment(int idUser, RequestCreateAppointmentDTO request);

	public AppointmentUserDTO updateAppoitment(int idUser, RequestUpdateAppointmentDTO request);

	public void deleteAppoitment(int idAppointment);
	
}
