package com.example.alekxmiecommerceapi.dto.country;

import com.example.alekxmiecommerceapi.dto.abstraction.DtoWithId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CountryDto extends DtoWithId {
    private Long id;
    private String name;
    private String code;
    private boolean removed;
}
