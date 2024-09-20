package com.clienteservidor.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "alunos")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long matricula;
    String nome;
    String telefone;
    boolean maioridade;
    @Enumerated(EnumType.STRING)
    Cursos curso;
    String sexo;
}
