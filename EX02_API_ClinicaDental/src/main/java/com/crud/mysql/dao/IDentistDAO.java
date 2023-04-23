/**
 * 
 */
package com.crud.mysql.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.mysql.model.entity.Dentist;

/**
 * @author Palmira
 *
 */
public interface IDentistDAO extends JpaRepository<Dentist, Integer>{

	
}
