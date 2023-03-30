package Teste.com.teste.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Teste.com.teste.Model.Temporada;

@Repository
public interface TemporadaRepository extends JpaRepository <Temporada, Long> {

}
