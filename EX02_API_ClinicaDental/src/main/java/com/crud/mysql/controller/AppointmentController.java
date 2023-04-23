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

import com.crud.mysql.model.dto.appointment.AppointmentDTO;
import com.crud.mysql.model.dto.appointment.AppointmentDentistDTO;
import com.crud.mysql.model.dto.appointment.AppointmentUserDTO;
import com.crud.mysql.model.dto.appointment.RequestCreateAppointmentDTO;
import com.crud.mysql.model.dto.appointment.RequestUpdateAppointmentDTO;
import com.crud.mysql.service.IAppointmentService;

/**
 * @author Palmira
 *
 */
@RestController
@RequestMapping("/api")
public class AppointmentController {

	@Autowired
	private IAppointmentService appointmentService;

	@PostMapping("/appointment/{idUser}")
	public AppointmentUserDTO createAppointment(@PathVariable int idUser, @RequestBody RequestCreateAppointmentDTO request) {
		return this.appointmentService.createAppointment(idUser, request);
	}
	
	@GetMapping("/appointment")
	public List<AppointmentDTO> listDentist() {
		return this.appointmentService.list();
	}
	
	@GetMapping("/appointment/{idAppointment}")
	public AppointmentDTO appointmentById(@PathVariable int idAppointment) {
		return this.appointmentService.findAppointmentById(idAppointment);
	}
	
	@GetMapping("/appointment/dni/{dni}")
	public List<AppointmentUserDTO>  findAppointmentByPatientDni(@PathVariable String dni) {
		return this.appointmentService.findAppointmentByPatientDni(dni);
	}
	
	@GetMapping("/appointment/dentist/{idDentist}")
	public List<AppointmentDentistDTO> findAppointmentByDentistId(@PathVariable int idDentist) {
		return this.appointmentService.findAppointmentByDentistId(idDentist);
	}
	
	@PutMapping("/appointment/{idUser}")
	public AppointmentUserDTO updateAppointment(@PathVariable int idUser
			, @RequestBody RequestUpdateAppointmentDTO request) {
		return this.appointmentService.updateAppoitment(idUser, request);
	}
	
	@DeleteMapping("/appointment/{idAppointment}")
	public void deleteAppointment(@PathVariable int idAppointment) {
		this.appointmentService.deleteAppoitment(idAppointment);
	}
}
