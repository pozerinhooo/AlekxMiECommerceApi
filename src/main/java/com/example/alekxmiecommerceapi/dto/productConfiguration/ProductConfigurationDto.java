package com.example.alekxmiecommerceapi.dto.productConfiguration;

import com.example.alekxmiecommerceapi.dto.abstraction.DtoWithId;
import com.example.alekxmiecommerceapi.dto.productVariationOption.ProductVariationOptionDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductConfigurationDto extends DtoWithId {
    private Long id;
    private Long productItemId;
    private ProductVariationOptionDto variationOption;
}
