package com.example.alekxmiecommerceapi.controller.productCategory;

import com.example.alekxmiecommerceapi.controller.abstraction.CRUDController;
import com.example.alekxmiecommerceapi.dto.productCategory.ProductCategoryDto;
import com.example.alekxmiecommerceapi.entity.product.ProductCategoryEntity;
import com.example.alekxmiecommerceapi.mapper.productCategory.ProductCategoryMapper;
import com.example.alekxmiecommerceapi.service.productCategory.ProductCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product-categories")
public class ProductCategoryController extends CRUDController<ProductCategoryEntity, ProductCategoryDto> {

}
