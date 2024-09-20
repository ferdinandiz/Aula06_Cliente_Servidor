package com.clienteservidor.repository;

import com.clienteservidor.model.Aluno;
import com.clienteservidor.model.Cursos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    public List<Aluno> findByNome(String nome);
    public List<Aluno> findByCurso(Cursos curso);
}
