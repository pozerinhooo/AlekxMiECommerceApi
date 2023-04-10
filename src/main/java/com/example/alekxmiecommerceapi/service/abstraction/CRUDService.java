package com.example.alekxmiecommerceapi.service.abstraction;

import com.example.alekxmiecommerceapi.entity.abstraction.EntityWithId;

import java.util.List;

public interface CRUDService<TEntity extends EntityWithId> {
    TEntity save(TEntity entity);
    List<TEntity> saveAll(List<TEntity> entities);
    TEntity getById(Long id);
    List<TEntity> getAll();
}
