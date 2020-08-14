package com.rd.treinamentodev.AvaliacaoSpringBoot.model.entity;
import lombok.Data;
import javax.persistence.*;

// Implementação da questão 5:
@Entity
@Data
@Table(name="tb_modulo")
public class ModuloEntity {
    @Id
    @Column(name="id_modulo")
    private Integer codigoModulo;

    @Column(name="ds_nome")
    private String nome;

    //Relacionamento entidade ModuloEntity & entidade InstrutorEntity
    @OneToOne
    @JoinColumn(name="id_instrutor")
    private InstrutorEntity codigoInstrutor;

}
