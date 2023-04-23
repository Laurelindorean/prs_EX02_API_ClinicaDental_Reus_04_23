/**
 * 
 */
package com.crud.mysql.model.dto.appointment;

import java.time.LocalDateTime;

import com.crud.mysql.model.dto.dentist.RequestInfoDentist;

/**
 * @author Palmira
 *
 */
public class AppointmentUserDTO {
	
	private int id;
	private LocalDateTime dateAppointment;
	private RequestInfoDentist infoDentist;
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
	 * @return the infoDentist
	 */
	public RequestInfoDentist getInfoDentist() {
		return infoDentist;
	}
	/**
	 * @param infoDentist the infoDentist to set
	 */
	public void setInfoDentist(RequestInfoDentist infoDentist) {
		this.infoDentist = infoDentist;
	}
	

}
