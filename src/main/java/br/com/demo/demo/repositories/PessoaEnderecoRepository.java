package br.com.demo.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.demo.demo.entities.PessoaEndereco;

@Repository
public interface PessoaEnderecoRepository extends JpaRepository<PessoaEndereco, Long> {  }
