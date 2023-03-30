package Teste.com.teste.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Teste.com.teste.Model.Local;

@Repository
public interface LocalRepository extends JpaRepository <Local, Long> {

}
