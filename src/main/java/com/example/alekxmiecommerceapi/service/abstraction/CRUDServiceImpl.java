package com.example.alekxmiecommerceapi.service.abstraction;

import com.example.alekxmiecommerceapi.entity.abstraction.BaseEntityWithId;
import com.example.alekxmiecommerceapi.exception.WebApiException;
import com.example.alekxmiecommerceapi.exception.WebApiExceptionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class CRUDServiceImpl<TEntity extends BaseEntityWithId> implements CRUDService<TEntity> {
    @Autowired
    private JpaRepository<TEntity, Long> repository;

    @Override
    public TEntity save(TEntity entity) {
        return this.repository.save(entity);
    }

    @Override
    public List<TEntity> saveAll(List<TEntity> entities) {
        return this.repository.saveAll(entities);
    }

    @Override
    public TEntity getById(Long id) {
        return this.repository.findById(id)
                .orElseThrow(() -> new WebApiException(WebApiExceptionType.ENTITY_NOT_FOUND));
    }

    @Override
    public List<TEntity> getAll() {
        return this.repository.findAll();
    }
}
