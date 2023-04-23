/**
 * 
 */
package com.crud.mysql.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.mysql.model.dto.appointment.AppointmentDentistDTO;
import com.crud.mysql.model.dto.appointment.AppointmentUserDTO;
import com.crud.mysql.model.entity.Appointment;

/**
 * @author Palmira
 *
 */
public interface IAppointmentDAO extends JpaRepository<Appointment, Integer> {

	//@Query("FROM appointment a WHERE a.dentist.id = :dentist_id")
	public List<AppointmentDentistDTO> findAppointmentByDentistId(int dentist_id);

	//@Query("FROM appointment a WHERE a.patient.dni = :dni")
	public List<AppointmentUserDTO> findAppointmentByPatientDni(String dni);
	
}
