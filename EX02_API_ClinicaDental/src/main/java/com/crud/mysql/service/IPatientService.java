/**
 * 
 */
package com.crud.mysql.service;

import java.util.List;

import com.crud.mysql.model.dto.patient.PatientDTO;
import com.crud.mysql.model.dto.patient.RequestCreatePatientDTO;
import com.crud.mysql.model.dto.patient.RequestUpdatePatientDTO;

/**
 * @author Palmira
 *
 */
public interface IPatientService {

	// CRUD Methods
	public List<PatientDTO> listPatient();

	public PatientDTO createPatient(RequestCreatePatientDTO request);

	public PatientDTO patientById(int id);

	public PatientDTO updatePatient(RequestUpdatePatientDTO request);

	public void deletePatient(int id);

}
