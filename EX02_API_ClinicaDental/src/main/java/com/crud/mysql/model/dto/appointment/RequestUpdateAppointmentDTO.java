package com.crud.mysql.model.dto.appointment;

import java.time.LocalDateTime;

public class RequestUpdateAppointmentDTO {

	private int idAppointment;
	private String psw;
	private LocalDateTime newDate;
	private int idDentist;

	/**
	 * @return the idAppointment
	 */
	public int getIdAppointment() {
		return idAppointment;
	}

	/**
	 * @param idAppointment the idAppointment to set
	 */
	public void setIdAppointment(int idAppointment) {
		this.idAppointment = idAppointment;
	}

	/**
	 * @return the psw
	 */
	public String getPsw() {
		return psw;
	}

	/**
	 * @param psw the psw to set
	 */
	public void setPsw(String psw) {
		this.psw = psw;
	}

	/**
	 * @return the newDate
	 */
	public LocalDateTime getNewDate() {
		return newDate;
	}

	/**
	 * @param newDate the newDate to set
	 */
	public void setNewDate(LocalDateTime newDate) {
		this.newDate = newDate;
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