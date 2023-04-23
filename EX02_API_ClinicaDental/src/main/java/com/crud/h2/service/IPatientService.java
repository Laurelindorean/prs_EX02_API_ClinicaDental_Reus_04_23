/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import com.crud.h2.model.dto.PatientDTO;
import com.crud.h2.model.dto.RequestCreatePatientDTO;
import com.crud.h2.model.dto.RequestUpdatePatientDTO;

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
