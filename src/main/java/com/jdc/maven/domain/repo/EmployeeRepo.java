package com.jdc.maven.domain.repo;

import java.util.UUID;

import com.jdc.maven.domain.BaseRepository;
import com.jdc.maven.domain.entity.Employee;

/**
 * Repository for Employee Entity
 */
public interface EmployeeRepo extends BaseRepository<Employee, UUID>{

}
