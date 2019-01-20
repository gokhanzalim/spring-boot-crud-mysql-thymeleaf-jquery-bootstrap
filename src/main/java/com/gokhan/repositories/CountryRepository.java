package com.gokhan.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.gokhan.entities.Country;

public interface CountryRepository extends JpaRepository<Country,Integer>{

}
