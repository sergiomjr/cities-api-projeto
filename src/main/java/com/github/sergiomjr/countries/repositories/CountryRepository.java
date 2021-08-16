package com.github.sergiomjr.countries.repositories;

import com.github.sergiomjr.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
