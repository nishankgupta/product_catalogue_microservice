package com.nishank.productcatalogue.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nishank.productcatalogue.dto.ProductDto;
import com.nishank.productcatalogue.entity.Brand;
import com.nishank.productcatalogue.enums.Category;
import com.nishank.productcatalogue.enums.Gender;
import com.nishank.productcatalogue.enums.Type;
import com.nishank.productcatalogue.mapper.ProductMapper;
import com.nishank.productcatalogue.repository.BrandRepository;
import com.nishank.productcatalogue.repository.ProductRepository;
import com.nishank.productcatalogue.service.contract.ProductService;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    private static final Logger LOGGER = Logger.getLogger(ProductServiceImpl.class);

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private BrandRepository brandRepository;

    @Override
    public ProductDto getProduct(int productId) {
        return ProductMapper.map(productRepository.findOne(productId));
    }

    @Override
    public List<ProductDto> getProductsByType(String type) {
        Type ty = Type.getType(type);

        if (ty == null)
            return null;

        return ProductMapper.map(productRepository.findByType(ty));
    }

    @Override
    public List<ProductDto> getProductsByCategory(String category) {
        Category cat = Category.getCategory(category);

        if (cat == null)
            return null;

        return ProductMapper.map(productRepository.findByCategory(cat));
    }

    @Override
    public List<ProductDto> getProductsbyGender(String gender) {
        Gender gen = Gender.getGender(gender);

        if (gen == null)
            return null;

        return ProductMapper.map(productRepository.findByGender(gen));
    }

    @Override
    public List<ProductDto> getProductsByBrand(String brand) {
        Brand br = brandRepository.findByName(brand.toUpperCase());

        if (br == null)
            return null;

        LOGGER.info("Found brand with id: " + br.getId());
        
        return ProductMapper.map(productRepository.findByBrand(br.getId()));
    }

    @Override
    public void deleteProduct(int productId) {
        productRepository.delete(productId);
    }

}
