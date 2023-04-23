/**
 * 
 */
package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.model.entity.Patient;

/**
 * @author Palmira
 *
 */
public interface IPatientDAO extends JpaRepository<Patient, Integer>{

}
