/**
 * 
 */
package com.crud.mysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.mysql.model.dto.patient.PatientDTO;
import com.crud.mysql.model.dto.patient.RequestCreatePatientDTO;
import com.crud.mysql.model.dto.patient.RequestUpdatePatientDTO;
import com.crud.mysql.service.IPatientService;

/**
 * @author Palmira
 *
 */
@RestController
@RequestMapping("/api")
public class PatientController {

	@Autowired
	private IPatientService patientService;

	@GetMapping("/patient")
	public List<PatientDTO> listPatient() {
		return this.patientService.listPatient();
	}

	@PostMapping("/patient")
	public PatientDTO createPatient(@RequestBody RequestCreatePatientDTO request) {
		return this.patientService.createPatient(request);

	}

	@PutMapping("/patient")
	public PatientDTO updatePatient(@RequestBody RequestUpdatePatientDTO patient) {
		return this.patientService.updatePatient(patient);
	}

	@GetMapping("/patient/{id}")
	public PatientDTO patientById(@PathVariable(name = "id") int id) {
		return this.patientService.patientById(id);
	}

	@DeleteMapping("/patient/{id}")
	public void deletePatient(@PathVariable(name = "id") int id) {
		this.patientService.deletePatient(id);
	}

}
