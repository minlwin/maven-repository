package com.jdc.maven.domain;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaDelete;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.CriteriaUpdate;

public class BaseRepositoryImpl<T, ID> extends SimpleJpaRepository<T, ID> implements BaseRepository<T, ID> {
	
	private EntityManager em;
	
	public BaseRepositoryImpl(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
		super(entityInformation, entityManager);
		this.em = entityManager;
	}

	@Override
	public <R> Optional<R> searchOne(Function<CriteriaBuilder, CriteriaQuery<R>> queryFunc) {
		return Optional.ofNullable(em.createQuery(queryFunc.apply(em.getCriteriaBuilder())).getSingleResult());
	}

	@Override
	public <R> List<R> searchAll(Function<CriteriaBuilder, CriteriaQuery<R>> queryFunc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Function<CriteriaBuilder, CriteriaUpdate<T>> queryFunc) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Function<CriteriaBuilder, CriteriaDelete<T>> queryFunc) {
		// TODO Auto-generated method stub
		return 0;
	}

}
