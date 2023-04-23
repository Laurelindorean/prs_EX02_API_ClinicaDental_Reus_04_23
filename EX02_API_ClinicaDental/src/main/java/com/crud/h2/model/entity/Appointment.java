/**
 * 
 */
package com.crud.h2.model.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

/**
 * @author Palmira
 *
 */
@Entity
@Table(name = "appointment")
public class Appointment {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_appointment")
	private LocalDateTime dateAppointment;

	@ManyToOne
	@JoinColumn(name = "patient_id")
	private Patient patient;

	@ManyToOne
	@JoinColumn(name = "dentist_id")
	private Dentist dentist;

	// Constructors
	public Appointment() {

	}

	/**
	 * @param id
	 * @param dateAppointment
	 * @param patient
	 * @param destist
	 */
	public Appointment(int id, LocalDateTime dateAppointment, Patient patient, Dentist dentist) {
		this.id = id;
		this.dateAppointment = dateAppointment;
		this.patient = patient;
		this.dentist = dentist;
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
	 * @return the patient
	 */
	public Patient getPatient() {
		return patient;
	}

	/**
	 * @param patient the patient to set
	 */
	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	/**
	 * @return the destist
	 */
	public Dentist getDentist() {
		return dentist;
	}

	/**
	 * @param destist the destist to set
	 */
	public void setDentist(Dentist dentist) {
		this.dentist = dentist;
	}

}
