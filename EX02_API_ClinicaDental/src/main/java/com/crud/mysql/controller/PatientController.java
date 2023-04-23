/**
 * 
 */
package com.crud.mysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.mysql.model.dto.PatientDTO;
import com.crud.mysql.model.dto.RequestUpdatePatientDTO;
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
	
	@PutMapping("/patient")
	public PatientDTO updatePatient(@RequestBody RequestUpdatePatientDTO patient) {
		return this.patientService.updatePatient(patient);
	}
	
}
