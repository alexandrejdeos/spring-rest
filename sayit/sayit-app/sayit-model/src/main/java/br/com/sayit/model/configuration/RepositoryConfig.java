package br.com.sayit.model.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * 
 * @author ajsantos
 * @date 2017-06-05
 * @description Configura repository
 */
@Configuration
@EnableJpaRepositories(basePackages = {"br.com.sayit.model.repository" })
public class RepositoryConfig {

}
