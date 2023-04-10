package com.example.alekxmiecommerceapi.mapper.product;

import com.example.alekxmiecommerceapi.dto.product.ProductDto;
import com.example.alekxmiecommerceapi.entity.product.ProductEntity;
import com.example.alekxmiecommerceapi.mapper.abstraction.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class ProductMapper implements EntityMapper<ProductEntity, ProductDto> {
}
