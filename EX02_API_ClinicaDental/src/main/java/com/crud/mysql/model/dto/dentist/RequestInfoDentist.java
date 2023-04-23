/**
 * 
 */
package com.crud.mysql.model.dto.dentist;

/**
 * @author Palmira
 *
 */
public class RequestInfoDentist {
	
	private int id;
	private String nameSurname;
	private String mail;
	private String speciality;
	
	
	/**
	 * 
	 */
	public RequestInfoDentist() {
		super();
	}
	/**
	 * @param id
	 * @param nameSurname
	 * @param mail
	 * @param speciality
	 */
	public RequestInfoDentist(int id, String nameSurname, String mail, String speciality) {
		super();
		this.id = id;
		this.nameSurname = nameSurname;
		this.mail = mail;
		this.speciality = speciality;
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
