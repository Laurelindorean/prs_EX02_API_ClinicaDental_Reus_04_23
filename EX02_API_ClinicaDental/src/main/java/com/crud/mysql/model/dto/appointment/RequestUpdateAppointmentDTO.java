package com.crud.mysql.model.dto.appointment;

import java.time.LocalDateTime;

public class RequestUpdateAppointmentDTO {

	private int idUser;
	private String psw;
	private LocalDateTime newDate;
	private int idDentist;

	/**
	 * @return the idUser
	 */
	public int getIdUser() {
		return idUser;
	}

	/**
	 * @param idUser the idUser to set
	 */
	public void setIdUser(int idUser) {
		this.idUser = idUser;
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