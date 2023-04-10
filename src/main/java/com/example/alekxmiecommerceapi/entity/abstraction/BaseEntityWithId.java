package com.example.alekxmiecommerceapi.entity.abstraction;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntityWithId implements EntityWithId {
}
