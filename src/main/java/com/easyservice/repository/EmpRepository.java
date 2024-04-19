package com.easyservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.easyservice.entity.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer> {

}
