package com.example.alekxmiecommerceapi.repository;

import com.example.alekxmiecommerceapi.entity.product.ProductCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategoryEntity, Long> {
}
