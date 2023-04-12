package com.example.alekxmiecommerceapi.mapper.productVariationOption;

import com.example.alekxmiecommerceapi.dto.productVariation.ProductVariationDto;
import com.example.alekxmiecommerceapi.dto.productVariationOption.ProductVariationOptionDto;
import com.example.alekxmiecommerceapi.entity.product.ProductVariationOptionEntity;
import com.example.alekxmiecommerceapi.mapper.abstraction.EntityMapper;
import com.example.alekxmiecommerceapi.mapper.productVariation.ProductVariationMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ProductVariationMapper.class})
public abstract class ProductVariationOptionMapper implements EntityMapper<ProductVariationOptionEntity, ProductVariationOptionDto> {
}
