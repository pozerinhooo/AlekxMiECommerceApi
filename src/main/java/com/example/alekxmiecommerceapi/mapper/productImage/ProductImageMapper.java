package com.example.alekxmiecommerceapi.mapper.productImage;

import com.example.alekxmiecommerceapi.dto.productImage.ProductImageDto;
import com.example.alekxmiecommerceapi.entity.product.ProductImageEntity;
import com.example.alekxmiecommerceapi.mapper.abstraction.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class ProductImageMapper implements EntityMapper<ProductImageEntity, ProductImageDto> {
}
