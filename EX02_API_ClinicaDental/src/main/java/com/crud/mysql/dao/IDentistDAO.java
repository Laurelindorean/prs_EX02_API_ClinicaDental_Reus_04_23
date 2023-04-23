/**
 * 
 */
package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.model.entity.Dentist;

/**
 * @author Palmira
 *
 */
public interface IDentistDAO extends JpaRepository<Dentist, Integer>{

	
}
