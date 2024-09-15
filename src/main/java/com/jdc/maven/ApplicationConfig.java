package com.jdc.maven;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.jdc.maven.domain.BaseRepositoryImpl;

@SpringBootConfiguration
@EnableAutoConfiguration
@EnableJpaRepositories(
	repositoryBaseClass = BaseRepositoryImpl.class)
public class ApplicationConfig {

}
