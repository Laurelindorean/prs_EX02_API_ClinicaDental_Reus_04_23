/**
 * 
 */
package com.crud.mysql.model.dto;

/**
 * @author Palmira
 *
 */
public class RequestCreatePatientDTO {

	private String dni;
	private String nameSurname;
	private String email;
	private String psw;

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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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
}
