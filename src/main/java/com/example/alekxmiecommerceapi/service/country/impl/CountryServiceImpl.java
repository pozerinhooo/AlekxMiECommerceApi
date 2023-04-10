package com.example.alekxmiecommerceapi.service.country.impl;

import com.example.alekxmiecommerceapi.entity.shipping.CountryEntity;
import com.example.alekxmiecommerceapi.repository.CountryRepository;
import com.example.alekxmiecommerceapi.service.abstraction.CRUDServiceImpl;
import com.example.alekxmiecommerceapi.service.country.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CountryServiceImpl extends CRUDServiceImpl<CountryEntity> implements CountryService {
    private final CountryRepository countryRepository;
}
