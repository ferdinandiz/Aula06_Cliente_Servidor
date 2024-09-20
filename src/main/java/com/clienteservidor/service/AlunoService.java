package com.clienteservidor.service;

import com.clienteservidor.model.Aluno;
import com.clienteservidor.model.Cursos;
import com.clienteservidor.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {
    @Autowired
    private AlunoRepository aluno;

    public List<Aluno> listarAlunos() {
        return aluno.findAll();
    }
    public Optional<Aluno> buscarAluno(Long id) {
        return aluno.findById(id);
    }
    public Aluno salvarAluno(Aluno a) {
        return aluno.save(a);
    }
    public void excluirAluno(Long id) {
        aluno.deleteById(id);
    }
    public Aluno atualizarAluno(Long id, Aluno a) {
        Optional<Aluno> alunoExiste = aluno.findById(id);
        if (alunoExiste.isPresent()) {
            a.setMatricula(id);
            return aluno.save(a);
        }
        return null;
    }

    public List<Aluno> listarAlunoPorNome(String nome) {
        return aluno.findByNome(nome);
    }

    public List<Aluno> listarAlunoPorCurso(Cursos curso) {
        return aluno.findByCurso(curso);
    }
}
