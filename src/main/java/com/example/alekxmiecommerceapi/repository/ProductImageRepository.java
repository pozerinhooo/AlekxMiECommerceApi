package com.example.alekxmiecommerceapi.repository;

import com.example.alekxmiecommerceapi.entity.product.ProductImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductImageRepository extends JpaRepository<ProductImageEntity, Long> {
}
