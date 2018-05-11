package com.nishank.productcatalogue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nishank.productcatalogue.entity.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {

    Brand findByName(String name);
}
