package Teste.com.teste.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Teste.com.teste.Model.Noticia;

@Repository
public interface NoticiaRepository extends JpaRepository <Noticia, Long> {

}
