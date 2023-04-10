package com.example.alekxmiecommerceapi.repository;

import com.example.alekxmiecommerceapi.entity.shipping.CountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<CountryEntity, Long> {
}
