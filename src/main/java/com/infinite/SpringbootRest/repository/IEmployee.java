package com.infinite.SpringbootRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infinite.SpringbootRest.model.Employee;

@Repository
public interface IEmployee extends JpaRepository<Employee, Long> {

}
