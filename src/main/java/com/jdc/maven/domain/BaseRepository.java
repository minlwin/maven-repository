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

	<R> Optional<R> searchOne(Function<CriteriaBuilder, CriteriaQuery<R>> queryFunc); 
	<R> List<R> searchAll(Function<CriteriaBuilder, CriteriaQuery<R>> queryFunc); 
	int update(Function<CriteriaBuilder, CriteriaUpdate<T>> queryFunc);
	int delete(Function<CriteriaBuilder, CriteriaDelete<T>> queryFunc);
}
