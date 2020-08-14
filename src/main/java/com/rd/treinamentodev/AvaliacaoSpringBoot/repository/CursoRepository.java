package com.rd.treinamentodev.AvaliacaoSpringBoot.repository;
import com.rd.treinamentodev.AvaliacaoSpringBoot.model.entity.CursoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CursoRepository extends JpaRepository<CursoEntity, Long> {
    //Questão 4--> Implementação de método de busca por nome do curso que retorna uma lista de cursos:
    List<CursoEntity> buscarNomeCurso(String nomeCurso); // select * from tb_curso where nome = ?
}
