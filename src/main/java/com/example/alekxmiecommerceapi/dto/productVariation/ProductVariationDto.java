package com.example.alekxmiecommerceapi.dto.productVariation;

import com.example.alekxmiecommerceapi.dto.abstraction.DtoWithId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductVariationDto extends DtoWithId {
    private Long id;
    private String name;
    private Long productCategoryId;
}
