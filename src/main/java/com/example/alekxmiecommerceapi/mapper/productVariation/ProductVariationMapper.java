package com.example.alekxmiecommerceapi.mapper.productVariation;

import com.example.alekxmiecommerceapi.dto.productVariation.ProductVariationDto;
import com.example.alekxmiecommerceapi.entity.product.ProductVariationEntity;
import com.example.alekxmiecommerceapi.mapper.abstraction.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class ProductVariationMapper implements EntityMapper<ProductVariationEntity, ProductVariationDto> {
}
