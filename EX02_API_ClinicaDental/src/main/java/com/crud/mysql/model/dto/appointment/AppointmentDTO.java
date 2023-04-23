/**
 * 
 */
package com.crud.mysql.model.dto.appointment;

import java.time.LocalDateTime;

import com.crud.mysql.model.dto.dentist.DentistDTO;
import com.crud.mysql.model.dto.patient.PatientDTO;

/**
 * @author Palmira
 *
 */
public class AppointmentDTO {
	
	private int id;
	private LocalDateTime dateAppointment;
	private DentistDTO dentistDTO;
	private PatientDTO patientDTO;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the dateAppointment
	 */
	public LocalDateTime getDateAppointment() {
		return dateAppointment;
	}
	/**
	 * @param dateAppointment the dateAppointment to set
	 */
	public void setDateAppointment(LocalDateTime dateAppointment) {
		this.dateAppointment = dateAppointment;
	}
	/**
	 * @return the dentistDTO
	 */
	public DentistDTO getDentistDTO() {
		return dentistDTO;
	}
	/**
	 * @param dentistDTO the dentistDTO to set
	 */
	public void setDentistDTO(DentistDTO dentistDTO) {
		this.dentistDTO = dentistDTO;
	}
	/**
	 * @return the patientDTO
	 */
	public PatientDTO getPatientDTO() {
		return patientDTO;
	}
	/**
	 * @param patientDTO the patientDTO to set
	 */
	public void setPatientDTO(PatientDTO patientDTO) {
		this.patientDTO = patientDTO;
	}
	

}

