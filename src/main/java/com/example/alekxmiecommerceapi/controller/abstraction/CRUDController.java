package com.example.alekxmiecommerceapi.controller.abstraction;

import com.example.alekxmiecommerceapi.dto.abstraction.DtoWithId;
import com.example.alekxmiecommerceapi.entity.abstraction.EntityWithId;
import com.example.alekxmiecommerceapi.mapper.abstraction.EntityMapper;
import com.example.alekxmiecommerceapi.service.abstraction.CRUDService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class CRUDController<TEntity extends EntityWithId, TDto extends DtoWithId> {
    @Autowired
    protected CRUDService<TEntity> service;

    @Autowired
    protected EntityMapper<TEntity, TDto> mapper;

    @PostMapping(value = "")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<TDto> save(@RequestBody TDto dto) {
        return ResponseEntity.ok(
                this.mapper.toDto(
                        this.service.save(
                                this.mapper.toEntity(dto)
                        )
                )
        );
    }

    @PostMapping(value = "/list")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<List<TDto>> saveList(@RequestBody List<TDto> list) {
        return ResponseEntity.ok(
                this.mapper.toDtoList(
                        this.service.saveAll(
                                this.mapper.toEntityList(list)
                        )
                )
        );
    }

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<TDto> getById(@PathVariable Long id) {
        return ResponseEntity.ok(
                this.mapper.toDto(
                        this.service.getById(id)
                )
        );
    }

    @GetMapping(value = "/list")
    public ResponseEntity<List<TDto>> getList() {
        return ResponseEntity.ok(
                this.mapper.toDtoList(
                        this.service.getAll()
                )
        );
    }
}
