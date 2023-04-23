/**
 * 
 */
package com.crud.mysql.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.mysql.model.entity.Dentist;

/**
 * @author Palmira
 *
 */
public interface IDentistDAO extends JpaRepository<Dentist, Integer>{
	
	public Dentist findByNameSurname(String nameSurname);

	
}
