package br.com.sayit.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.stereotype.Repository;

import br.com.sayit.model.entity.Acao;

@Repository
public interface AcaoRepository extends JpaRepository<Acao, Long>, QueryDslPredicateExecutor<Acao>{
	
}
