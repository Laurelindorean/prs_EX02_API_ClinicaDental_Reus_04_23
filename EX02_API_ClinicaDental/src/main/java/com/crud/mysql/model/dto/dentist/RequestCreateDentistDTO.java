/**
 * 
 */
package com.crud.mysql.model.dto.dentist;

/**
 * @author Palmira
 *
 */
public class RequestCreateDentistDTO {
	
	private String dni;
	private String nameSurname;
	private String mail;
	private String psw;
	private String speciality;
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
	 * @return the speciality
	 */
	public String getSpeciality() {
		return speciality;
	}
	/**
	 * @param speciality the speciality to set
	 */
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	

}
