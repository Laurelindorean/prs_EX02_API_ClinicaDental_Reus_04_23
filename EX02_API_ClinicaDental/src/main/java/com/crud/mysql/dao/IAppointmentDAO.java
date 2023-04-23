/**
 * 
 */
package com.crud.mysql.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.crud.mysql.model.dto.appointment.AppointmentUserDTO;
import com.crud.mysql.model.entity.Appointment;

/**
 * @author Palmira
 *
 */
public interface IAppointmentDAO extends JpaRepository<Appointment, Integer> {

	
	public List<Appointment> findAppointmentByDentistId(int dentist_id);

	@Query(""
			+ " SELECT new com.crud.mysql.model.dto.appointment.AppointmentUserDTO("
			+ "  a.id"
			+ " ,a.dateAppointment"
			+ "	,a.dentist.id"
			+ "	,a.dentist.nameSurname"
			+ "	,a.dentist.mail"
			+ "	,a.dentist.speciality"
			+ ")"
			+ "	FROM Appointment a "
			+ "	WHERE a.patient.dni = :dni")
	public List<AppointmentUserDTO> findAppointmentByPatientDni(String dni);
	
}
