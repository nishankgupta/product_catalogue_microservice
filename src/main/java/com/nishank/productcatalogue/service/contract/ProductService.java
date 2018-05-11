package com.nishank.productcatalogue.service.contract;

import java.util.List;

import com.nishank.productcatalogue.dto.ProductDto;

public interface ProductService {

    ProductDto getProduct(int productId);

    List<ProductDto> getProductsByType(String type);

    List<ProductDto> getProductsByCategory(String category);

    List<ProductDto> getProductsbyGender(String gender);

    List<ProductDto> getProductsByBrand(String brandname);

    void deleteProduct(int productId);
}
