package com.example.alekxmiecommerceapi.service.product.impl;

import com.example.alekxmiecommerceapi.entity.product.ProductEntity;
import com.example.alekxmiecommerceapi.service.abstraction.CRUDServiceImpl;
import com.example.alekxmiecommerceapi.service.product.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl extends CRUDServiceImpl<ProductEntity> implements ProductService {
}
