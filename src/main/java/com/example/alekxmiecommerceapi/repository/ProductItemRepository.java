package com.example.alekxmiecommerceapi.repository;

import com.example.alekxmiecommerceapi.entity.product.ProductItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductItemRepository extends JpaRepository<ProductItemEntity, Long> {
}
