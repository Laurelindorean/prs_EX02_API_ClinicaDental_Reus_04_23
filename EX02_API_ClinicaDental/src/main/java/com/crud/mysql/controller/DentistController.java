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

import com.crud.mysql.model.dto.dentist.DentistDTO;
import com.crud.mysql.model.dto.dentist.RequestCreateDentistDTO;
import com.crud.mysql.model.dto.dentist.RequestUpdateDentistDTO;
import com.crud.mysql.service.IDentistService;

/**
 * @author Palmira
 *
 */
@RestController
@RequestMapping("/api")
public class DentistController {

	@Autowired
	private IDentistService dentistService;

	@GetMapping("/dentist")
	public List<DentistDTO> listDentist() {
		return this.dentistService.listDentist();
	}

	@PostMapping("/dentist")
	public DentistDTO createDentist(@RequestBody RequestCreateDentistDTO request) {
		return this.dentistService.createDentist(request);
	}

	@GetMapping("/dentist/{id}")
	public DentistDTO dentistById(@PathVariable(name = "id") int id) {
		return this.dentistService.dentistById(id);
	}

	@PutMapping("/dentist")
	public DentistDTO updateDentist(@RequestBody RequestUpdateDentistDTO dentist) {
		return this.dentistService.updateDentist(dentist);
	}

	@GetMapping("/dentist/nameSurname/{nameSurname}")
	public DentistDTO findByNameSurname(@PathVariable(name = "nameSurname") String nameSurname) {
		return this.dentistService.findByNameSurname(nameSurname);
	}

	@DeleteMapping("/dentist/{id}")
	public void deleteDentist(@PathVariable(name = "id") int id) {
		this.dentistService.deleteDentist(id);
	}

}
