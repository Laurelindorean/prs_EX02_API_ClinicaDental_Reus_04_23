/**
 * 
 */
package com.crud.mysql.service;

import java.util.List;

import com.crud.mysql.model.dto.PatientDTO;
import com.crud.mysql.model.dto.RequestCreatePatientDTO;
import com.crud.mysql.model.dto.RequestUpdatePatientDTO;

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
