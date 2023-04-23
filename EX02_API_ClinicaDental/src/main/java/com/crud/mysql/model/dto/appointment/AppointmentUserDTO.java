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
	 * 
	 */
	public AppointmentUserDTO() {
		super();
	}
	/**
	 * @param id
	 * @param dateAppointment
	 * @param infoDentist
	 */
	public AppointmentUserDTO(int id, LocalDateTime dateAppointment, int idDentist, String nameSurname, String mail, String speciality) {
		super();
		this.id = id;
		this.dateAppointment = dateAppointment;
		this.infoDentist = new RequestInfoDentist(idDentist, nameSurname, mail, speciality);
	}
	
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
