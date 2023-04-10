package com.example.alekxmiecommerceapi.controller.country;

import com.example.alekxmiecommerceapi.controller.abstraction.CRUDController;
import com.example.alekxmiecommerceapi.dto.country.CountryDto;
import com.example.alekxmiecommerceapi.entity.shipping.CountryEntity;
import com.example.alekxmiecommerceapi.mapper.country.CountryMapper;
import com.example.alekxmiecommerceapi.service.country.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/countries")
@RequiredArgsConstructor
public class CountryController extends CRUDController<CountryEntity, CountryDto> {
    @Autowired
    protected CountryService countryService;

    @Autowired
    protected CountryMapper countryMapper;
}
