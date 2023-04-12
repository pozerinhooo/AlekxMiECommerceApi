package com.example.alekxmiecommerceapi.dto.productImage;

import com.example.alekxmiecommerceapi.dto.abstraction.DtoWithId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductImageDto extends DtoWithId {
    private Long id;
    private Long productItem;
    private String imagePath;
}
