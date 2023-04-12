package com.example.alekxmiecommerceapi.repository;

import com.example.alekxmiecommerceapi.entity.product.ProductVariationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductVariationRepository extends JpaRepository<ProductVariationEntity, Long> {
}
