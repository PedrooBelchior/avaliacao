package com.rd.treinamentodev.AvaliacaoSpringBoot.repository;
import com.rd.treinamentodev.AvaliacaoSpringBoot.model.entity.CursoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CursoRepository extends JpaRepository<CursoEntity, Long> {
    //Questão 4--> Implementação de método de busca por nome do curso que retorna uma lista de cursos:
    List<CursoEntity> findByNomeCurso (String nomeCurso); // select * from tb_curso where nome = ?
}
