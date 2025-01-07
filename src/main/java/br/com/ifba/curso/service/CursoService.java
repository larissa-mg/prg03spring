package br.com.ifba.curso.service;

import br.com.ifba.curso.dao.CursoIDao;
import br.com.ifba.curso.entity.Curso;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author larissa
 */

@Service
public class CursoService implements CursoIService {
    @Autowired
    private CursoIDao cursoDao;
    
    @Override
    public Curso save(Curso curso) throws RuntimeException{
        //Verifica se o objeto curso é nulo, se for, lança uma exceção informando que os dados não foram preenchidos
        if(curso == null){
            throw new RuntimeException ("Dados do curso nao preenchidos");
            
        //Verifica se o curso já possui um ID (caso tenha, significa que o curso já existe na base de dados)
        } else if(curso.getId() != null){
            throw new RuntimeException ("Curso ja existente no banco de dados");
            
        //Se o curso não for nulo e não tiver ID, então ele é inserido no banco de dados
        } else {
            return cursoDao.save(curso);
        }
    }

    @Override
    public List<Curso> findAll() {
        //Retorna todos os cursos encontrados no banco de dados
        return cursoDao.findAll();
    }

    @Override
    public Curso update(Curso curso) throws RuntimeException{
        //Verifica se o objeto curso é nulo, se for, lança uma exceção informando que os dados não foram preenchidos
        if(curso == null){
            throw new RuntimeException ("Dados do curso nao preenchidos");
            
        //Se o curso não for nulo, então ele é atualizado no banco de dados
        } else {
            return cursoDao.update(curso);
        }
    }

    @Override
    public void delete(Curso curso) {
        //Verifica se o objeto curso é nulo, se for, lança uma exceção informando que os dados não foram preenchidos
        if(curso == null){
            throw new RuntimeException ("Dados do curso nao preenchidos");
        //Exclui o curso do banco de dados utilizando o cursoDao
        } else {
            cursoDao.delete(curso);
        }
    }

    @Override
    public Curso findById(Long id) {
        // Verifica se o ID fornecido é nulo, caso seja, lança uma exceção informando que o ID não foi preenchido
        if(id == null){
            throw new RuntimeException ("ID nao preenchido");
            
        //Retorna o curso encontrado pelo ID utilizando o cursoDao
        } else {
            return cursoDao.findById(id);
        }
    }

    @Override
    public List<Curso> findByNome(String nome) {
        //Verifica se o nome fornecido é nulo, caso seja, lança uma exceção informando que o nome não foi preenchido
        if(nome == null || nome.trim().isEmpty()){
            throw new RuntimeException ("Nome não preenchido");
        } else {
            //Retorna uma lista de cursos encontrados pelo nome utilizando o cursoDao
            return cursoDao.findByNome(nome);
        }
    }
}