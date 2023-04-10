package com.example.alekxmiecommerceapi.entity.product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "product_configuration")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductConfigurationEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_item_id")
    private Long productItemId;

    @ManyToOne(cascade = {
            CascadeType.DETACH, CascadeType.MERGE
    })
    @JoinColumn(name = "product_variation_option_id", referencedColumnName = "id")
    private ProductVariationOptionEntity variationOption;
}