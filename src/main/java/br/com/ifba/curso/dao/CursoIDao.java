package br.com.ifba.curso.dao;

import br.com.ifba.curso.entity.Curso;
import br.com.ifba.infrastructure.dao.GenericIDao;
import java.util.List;

/**
 *
 * @author larissa
 */
public interface CursoIDao extends GenericIDao<Curso>{

    public List<Curso> findByNome(String nome);
    
}
