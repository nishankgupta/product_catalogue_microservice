package com.nishank.productcatalogue.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nishank.productcatalogue.entity.Product;
import com.nishank.productcatalogue.enums.Category;
import com.nishank.productcatalogue.enums.Gender;
import com.nishank.productcatalogue.enums.Type;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    List<Product> findByCategory(Category category);

    List<Product> findByType(Type type);

    List<Product> findByGender(Gender gender);

    @Query("FROM Product p WHERE p.brand.id = :brandId")
    List<Product> findByBrand(@Param("brandId") int brandId);
}
