package com.baeldung.springsoap.repository;

import com.baeldung.springsoap.gen.Country;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Repository
public class CountryRepository {

    private static final Map<String, Country> countries = new HashMap<>();

    @PostConstruct
    public void initData() {
        // initialize countries map
    }

    public Country findCountry(String name) {
        return countries.get(name);
    }
}