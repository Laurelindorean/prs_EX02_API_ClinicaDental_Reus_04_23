/**
 * 
 */
package com.crud.mysql.service;

import java.util.List;

import com.crud.mysql.model.dto.dentist.DentistDTO;
import com.crud.mysql.model.dto.dentist.RequestCreateDentistDTO;
import com.crud.mysql.model.dto.dentist.RequestUpdateDentistDTO;

/**
 * @author Palmira
 *
 */
public interface IDentistService {

	// CRUD Methods
	public List<DentistDTO> listDentist();

	public DentistDTO createDentist(RequestCreateDentistDTO request);

	public DentistDTO dentistById(int id);

	public DentistDTO updateDentist(RequestUpdateDentistDTO dentist);

	public DentistDTO findByNameSurname(String nameSurname);

	public void deleteDentist(int id);

}
