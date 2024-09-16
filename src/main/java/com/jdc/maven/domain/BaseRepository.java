package com.jdc.maven.domain;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaDelete;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.CriteriaUpdate;

@NoRepositoryBean
public interface BaseRepository<T, ID> extends JpaRepository<T, ID>{

	/**
	 * Query Method for Searching Single or None Result with Criteria Query Approach
	 * 
	 * @param <R> Result Type Parameter
	 * @param queryFunc	Function to create Criteria Query
	 * @return Optional Result
	 * 
	 */
	<R> Optional<R> searchOne(Function<CriteriaBuilder, CriteriaQuery<R>> queryFunc); 
	
	/**
	 * Query Method for Searching Zero or List Result with Criteria Query Approach
	 * 
	 * @param <R> Result Type Parameter
	 * @param queryFunc Function to create Criteria Query
	 * @return Search Result with List
	 */
	<R> List<R> searchAll(Function<CriteriaBuilder, CriteriaQuery<R>> queryFunc); 
	
	/**
	 * Bulk Update method for Criteria Approach
	 * @param queryFunc Function to create update query
	 * @return Effective Record Count
	 */
	int update(Function<CriteriaBuilder, CriteriaUpdate<T>> queryFunc);
	
	/**
	 * Bulk Delete method for Criteria Approach
	 * @param queryFunc Function to create delete query
	 * @return Effective Record Count
	 */
	int delete(Function<CriteriaBuilder, CriteriaDelete<T>> queryFunc);
}
