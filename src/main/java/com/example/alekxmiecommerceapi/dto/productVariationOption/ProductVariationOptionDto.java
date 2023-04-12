package com.example.alekxmiecommerceapi.dto.productVariationOption;

import com.example.alekxmiecommerceapi.dto.abstraction.DtoWithId;
import com.example.alekxmiecommerceapi.dto.productVariation.ProductVariationDto;
import com.example.alekxmiecommerceapi.entity.product.ProductVariationEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductVariationOptionDto extends DtoWithId {
    private Long id;
    private String value;
    private ProductVariationDto variation;
}
