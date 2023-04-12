package com.example.alekxmiecommerceapi.mapper.productConfiguration;

import com.example.alekxmiecommerceapi.dto.productConfiguration.ProductConfigurationDto;
import com.example.alekxmiecommerceapi.entity.product.ProductConfigurationEntity;
import com.example.alekxmiecommerceapi.mapper.abstraction.EntityMapper;
import com.example.alekxmiecommerceapi.mapper.productVariationOption.ProductVariationOptionMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ProductVariationOptionMapper.class})
public abstract class ProductConfigurationMapper implements EntityMapper<ProductConfigurationEntity, ProductConfigurationDto> {
}
