package com.example.alekxmiecommerceapi.mapper.productCategory;

import com.example.alekxmiecommerceapi.dto.productCategory.ProductCategoryDto;
import com.example.alekxmiecommerceapi.entity.product.ProductCategoryEntity;
import com.example.alekxmiecommerceapi.mapper.abstraction.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class ProductCategoryMapper implements EntityMapper<ProductCategoryEntity, ProductCategoryDto> {
}
