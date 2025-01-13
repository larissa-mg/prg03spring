package br.com.ifba.curso.repository;

import br.com.ifba.curso.entity.Curso;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author larissa
 */

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
    public List<Curso> findByNome(String nome);
}
