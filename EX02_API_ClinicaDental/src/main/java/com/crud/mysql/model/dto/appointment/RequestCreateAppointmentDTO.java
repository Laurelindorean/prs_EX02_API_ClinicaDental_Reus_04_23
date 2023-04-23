/**
 * 
 */
package com.crud.mysql.model.dto.appointment;

import java.time.LocalDateTime;

/**
 * @author Palmira
 *
 */
public class RequestCreateAppointmentDTO {

	private LocalDateTime dateAppointment;
	private int idDentist;

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
	 * @return the idDentist
	 */
	public int getIdDentist() {
		return idDentist;
	}

	/**
	 * @param idDentist the idDentist to set
	 */
	public void setIdDentist(int idDentist) {
		this.idDentist = idDentist;
	}
}