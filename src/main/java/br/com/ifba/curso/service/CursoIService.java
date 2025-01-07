package br.com.ifba.curso.service;

import br.com.ifba.curso.entity.Curso;
import java.util.List;

/**
 *
 * @author larissa
 */
public interface CursoIService {
    
    public abstract List <Curso> findAll();
    public abstract Curso save(Curso curso);
    public abstract Curso update(Curso curso);
    public abstract void delete(Curso curso);
    public abstract Curso findById(Long id);
    public abstract List <Curso> findByNome(String nome);
    
}