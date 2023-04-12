package com.example.alekxmiecommerceapi.mapper.productItem;

import com.example.alekxmiecommerceapi.dto.productItem.ProductItemDto;
import com.example.alekxmiecommerceapi.entity.product.ProductItemEntity;
import com.example.alekxmiecommerceapi.mapper.abstraction.EntityMapper;
import com.example.alekxmiecommerceapi.mapper.product.ProductMapper;
import com.example.alekxmiecommerceapi.mapper.productConfiguration.ProductConfigurationMapper;
import com.example.alekxmiecommerceapi.mapper.productImage.ProductImageMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ProductMapper.class, ProductConfigurationMapper.class, ProductImageMapper.class})
public abstract class ProductItemMapper implements EntityMapper<ProductItemEntity, ProductItemDto> {
}
