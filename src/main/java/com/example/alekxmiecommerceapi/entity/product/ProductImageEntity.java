package com.example.alekxmiecommerceapi.entity.product;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "product_image")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductImageEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_item_id")
    private Long productItem;

    @Column(name = "image_path")
    private String imagePath;
}
