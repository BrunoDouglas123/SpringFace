package Teste.com.teste.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Teste.com.teste.Model.Morador;

@Repository
public interface MoradorRepository extends JpaRepository <Morador, Long> {

}
