package br.com.ifba.infrastructure.dao;

import br.com.ifba.infrastructure.entity.PersistenceEntity;
import java.util.List;

/**
 *
 * @author larissa
 * @param <Entity>
 */
public interface GenericIDao <Entity extends PersistenceEntity> {
    
    public abstract Entity save(Entity obj);
    public abstract Entity update(Entity obj);
    public abstract void delete(Entity obj);
    public abstract Entity findById(Long id);
    public abstract List<Entity> findAll();
    
}