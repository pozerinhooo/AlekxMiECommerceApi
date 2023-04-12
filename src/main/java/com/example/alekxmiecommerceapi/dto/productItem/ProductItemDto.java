package com.example.alekxmiecommerceapi.dto.productItem;

import com.example.alekxmiecommerceapi.dto.abstraction.DtoWithId;
import com.example.alekxmiecommerceapi.dto.product.ProductDto;
import com.example.alekxmiecommerceapi.dto.productConfiguration.ProductConfigurationDto;
import com.example.alekxmiecommerceapi.dto.productImage.ProductImageDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductItemDto extends DtoWithId {
    private Long id;
    private ProductDto product;
    private String skuCode;
    private Long quantityInStock;
    private BigDecimal price;
    private List<ProductImageDto> images;
    private boolean removed;
    private LocalDateTime createdAt;
    private LocalDateTime lastUpdated;
    private List<ProductConfigurationDto> productConfiguration;
}
