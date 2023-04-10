package com.example.alekxmiecommerceapi.controller.product;

import com.example.alekxmiecommerceapi.controller.abstraction.CRUDController;
import com.example.alekxmiecommerceapi.dto.product.ProductDto;
import com.example.alekxmiecommerceapi.entity.product.ProductEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController extends CRUDController<ProductEntity, ProductDto> {

}
