package br.com.demo.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.demo.demo.entities.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> { 
}
