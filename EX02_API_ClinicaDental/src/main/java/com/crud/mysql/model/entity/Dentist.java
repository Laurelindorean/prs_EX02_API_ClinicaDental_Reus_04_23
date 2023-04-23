/**
 * 
 */
package com.crud.mysql.model.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * @author Palmira
 *
 */
@Entity
@Table(name = "dentist")
public class Dentist {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String dni;
	@Column(name = "name_surname")
	private String nameSurname;
	private String mail;
	private String psw;
	private String speciality;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dentist")
	private List<Appointment> appointment;

	// Constructos

	public Dentist() {

	}

	/**
	 * @param id
	 * @param dni
	 * @param nameSurname
	 * @param mail
	 * @param psw
	 * @param speciality
	 * @param appointment
	 */
	public Dentist(int id, String dni, String nameSurname, String mail, String psw, String speciality,
			List<Appointment> appointment) {

		this.id = id;
		this.dni = dni;
		this.nameSurname = nameSurname;
		this.mail = mail;
		this.psw = psw;
		this.speciality = speciality;
		this.appointment = appointment;
	}

	// Getters & Setters

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

	/**
	 * @return the appointment
	 */
	@JsonIgnore
	public List<Appointment> getAppointment() {
		return appointment;
	}

	/**
	 * @param appointment the appointment to set
	 */
	public void setAppointment(List<Appointment> appointment) {
		this.appointment = appointment;
	}

}
