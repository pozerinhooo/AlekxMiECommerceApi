package com.example.alekxmiecommerceapi.entity.product;

import com.example.alekxmiecommerceapi.entity.abstraction.BaseEntityWithId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "product_variation_option")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductVariationOptionEntity extends BaseEntityWithId {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "value")
    private String value;

    @ManyToOne(cascade = {
            CascadeType.DETACH, CascadeType.MERGE
    })
    @JoinColumn(name = "product_variation_id")
    private ProductVariationEntity variation;
}
