package com.jdc.maven;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.jdc.maven.domain.BaseRepositoryImpl;

@Configuration
@EnableJpaRepositories(
	repositoryBaseClass = BaseRepositoryImpl.class)
public class ApplicationConfig {

}
