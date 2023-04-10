package com.example.alekxmiecommerceapi.entity.product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name = "product_item")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductItemEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = {
            CascadeType.DETACH, CascadeType.MERGE
    })
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private ProductEntity product;

    @Column(name = "sku_code")
    private String skuCode;

    @Column(name = "quantity_in_stock")
    private Long quantityInStock;

    @Column(name = "price")
    private BigDecimal price;

    @JoinColumn(name = "product_item_id", referencedColumnName = "id")
    @OneToMany(cascade = CascadeType.ALL)
    private List<ProductImageEntity> images;

    @Column(name = "removed")
    private boolean removed;

    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column(name = "last_updated")
    @UpdateTimestamp
    private LocalDateTime lastUpdated;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_item_id", referencedColumnName = "id")
    private List<ProductConfigurationEntity> productConfiguration;
}
