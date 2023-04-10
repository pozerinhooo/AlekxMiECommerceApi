package com.example.alekxmiecommerceapi.dto.product;

import com.example.alekxmiecommerceapi.dto.abstraction.DtoWithId;
import com.example.alekxmiecommerceapi.entity.product.ProductCategoryEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDto extends DtoWithId {
    private Long id;

    private String name;

    private String description;

    private boolean removed;

    private LocalDateTime createdAt;

    private LocalDateTime lastUpdated;

    private Long productCategoryId;
}
