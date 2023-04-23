/**
 * 
 */
package com.crud.mysql.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.mysql.model.entity.Patient;

/**
 * @author Palmira
 *
 */
public interface IPatientDAO extends JpaRepository<Patient, Integer>{

}
