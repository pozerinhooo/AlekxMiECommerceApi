package com.example.alekxmiecommerceapi.entity.product;

import com.example.alekxmiecommerceapi.entity.abstraction.BaseEntityWithId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "product_category")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductCategoryEntity extends BaseEntityWithId {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "parent_category_id")
    private Long parentCategoryId;

    @Column(name = "removed")
    private boolean removed;

    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "last_updated")
    private LocalDateTime lastUpdated;
}
