/**
 * 
 */
package com.crud.h2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.crud.h2.model.entity.Appointment;

/**
 * @author Palmira
 *
 */
public interface IAppointmentDAO extends JpaRepository<Appointment, Integer> {
/*
	@Query("FROM appointment a WHERE a.dentist.id = :dentist_id")
	public List<Appointment> findAppointmentByDentistId(int dentist_id);

	@Query("FROM appointment a WHERE a.patient.dni = :dni")
	public List<Appointment> findAppointmentByPatientDni(String dni);
	*/
}
