package com.example.alekxmiecommerceapi.service.productCategory.impl;

import com.example.alekxmiecommerceapi.entity.product.ProductCategoryEntity;
import com.example.alekxmiecommerceapi.repository.ProductCategoryRepository;
import com.example.alekxmiecommerceapi.service.abstraction.CRUDServiceImpl;
import com.example.alekxmiecommerceapi.service.productCategory.ProductCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductCategoryServiceImpl extends CRUDServiceImpl<ProductCategoryEntity> implements ProductCategoryService {
}
