/**
 * 
 */
package com.crud.h2.model.dto;

/**
 * @author Palmira
 *
 */
public class RequestUpdatePatientDTO {

	private int id;
	private String dni;
	private String nameSurname;
	private String mail;
	private String oldPsw;
	private String newPsw;

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
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the nameSurname
	 */
	public String getNameSurname() {
		return nameSurname;
	}

	/**
	 * @param nameSurname the nameSurname to set
	 */
	public void setNameSurname(String nameSurname) {
		this.nameSurname = nameSurname;
	}

	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * @return the oldPsw
	 */
	public String getOldPsw() {
		return oldPsw;
	}

	/**
	 * @param oldPsw the oldPsw to set
	 */
	public void setOldPsw(String oldPsw) {
		this.oldPsw = oldPsw;
	}

	/**
	 * @return the newPsw
	 */
	public String getNewPsw() {
		return newPsw;
	}

	/**
	 * @param newPsw the newPsw to set
	 */
	public void setNewPsw(String newPsw) {
		this.newPsw = newPsw;
	}
}
