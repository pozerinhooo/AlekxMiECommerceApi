package com.example.alekxmiecommerceapi.controller;

import com.example.alekxmiecommerceapi.dto.country.CountryDto;
import com.example.alekxmiecommerceapi.mapper.country.CountryMapper;
import com.example.alekxmiecommerceapi.service.country.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/countries")
@RequiredArgsConstructor
public class CountryController {
    private final CountryService countryService;
    private final CountryMapper countryMapper;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<List<CountryDto>> saveCountries(@RequestBody List<CountryDto> countryDtoList) {
        return ResponseEntity.ok(
                countryMapper.toDtoList(
                        countryService.saveAll(
                                countryMapper.toEntityList(countryDtoList)
                        )
                )
        );
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<CountryDto>> getAllCountries() {
        return ResponseEntity.ok(
                countryMapper.toDtoList(
                        countryService.getAll()
                )
        );
    }
}
