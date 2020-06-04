package br.bossini.com.veiculo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.bossini.com.veiculo.model.Veiculo;

@Repository
public interface VeiculosRepository extends JpaRepository <Veiculo, Long> {

	
}
