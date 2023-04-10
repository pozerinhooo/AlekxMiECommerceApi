package com.example.alekxmiecommerceapi.mapper.country;


import com.example.alekxmiecommerceapi.dto.country.CountryDto;
import com.example.alekxmiecommerceapi.entity.shipping.CountryEntity;
import com.example.alekxmiecommerceapi.mapper.abstraction.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class CountryMapper implements EntityMapper<CountryEntity, CountryDto> {
}
