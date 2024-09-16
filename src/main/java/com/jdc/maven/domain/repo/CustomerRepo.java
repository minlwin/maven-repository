package com.jdc.maven.domain.repo;

import java.util.UUID;

import com.jdc.maven.domain.BaseRepository;
import com.jdc.maven.domain.entity.Customer;

/**
 * Repository for Customer Entity
 */
public interface CustomerRepo extends BaseRepository<Customer, UUID>{

}
