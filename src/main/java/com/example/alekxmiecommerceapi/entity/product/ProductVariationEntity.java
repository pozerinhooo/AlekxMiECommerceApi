package com.example.alekxmiecommerceapi.entity.product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "product_variation")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductVariationEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "product_category_id")
    private Long productCategoryId;
}
