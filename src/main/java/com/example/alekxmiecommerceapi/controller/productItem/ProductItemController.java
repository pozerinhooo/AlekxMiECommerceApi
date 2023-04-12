package com.example.alekxmiecommerceapi.controller.productItem;

import com.example.alekxmiecommerceapi.controller.abstraction.CRUDController;
import com.example.alekxmiecommerceapi.dto.productItem.ProductItemDto;
import com.example.alekxmiecommerceapi.entity.product.ProductItemEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "api/product-items")
public class ProductItemController extends CRUDController<ProductItemEntity, ProductItemDto> {
}
