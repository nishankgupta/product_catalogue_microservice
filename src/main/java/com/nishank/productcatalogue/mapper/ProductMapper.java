package com.nishank.productcatalogue.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.CollectionUtils;

import com.nishank.productcatalogue.dto.BrandDto;
import com.nishank.productcatalogue.dto.ProductColorDto;
import com.nishank.productcatalogue.dto.ProductDto;
import com.nishank.productcatalogue.dto.ProductSizeDto;
import com.nishank.productcatalogue.entity.Brand;
import com.nishank.productcatalogue.entity.Product;
import com.nishank.productcatalogue.entity.ProductColor;
import com.nishank.productcatalogue.entity.ProductSize;

public class ProductMapper {

    public static ProductDto map(Product product) {

        if (product == null)
            return null;

        ProductDto productDto = new ProductDto();

        productDto.setBrand(map(product.getBrand()));
        productDto.setCategory(product.getCategory());
        productDto.setGender(product.getGender());
        productDto.setType(product.getType());
        productDto.setId(product.getId());
        productDto.setName(product.getName());

        if (!CollectionUtils.isEmpty(product.getProductColor())) {
            List<ProductColorDto> productColorDtos = new ArrayList<>();
            productDto.setProductColor(productColorDtos);

            for (ProductColor productColor : product.getProductColor()) {
                productColorDtos.add(map(productColor));
            }
        }

        if (!CollectionUtils.isEmpty(product.getProductSizes())) {
            List<ProductSizeDto> productSizeDtos = new ArrayList<>();
            productDto.setProductSizes(productSizeDtos);

            for (ProductSize productSize : product.getProductSizes()) {
                productSizeDtos.add(map(productSize));
            }
        }

        return productDto;
    }

    public static List<ProductDto> map(List<Product> products) {
        if (CollectionUtils.isEmpty(products))
            return null;

        List<ProductDto> result = new ArrayList<>();

        for (Product product : products) {
            result.add(map(product));
        }

        return result;
    }

    private static ProductSizeDto map(ProductSize productSize) {
        if (productSize == null)
            return null;

        ProductSizeDto productSizeDto = new ProductSizeDto();
        productSizeDto.setId(productSize.getId());
        productSizeDto.setSize(productSize.getSize());

        return productSizeDto;
    }

    private static ProductColorDto map(ProductColor productColor) {
        if (productColor == null)
            return null;

        ProductColorDto productColorDto = new ProductColorDto();
        productColorDto.setColorCode(productColor.getColorCode());
        productColorDto.setId(productColor.getId());

        return productColorDto;
    }

    private static BrandDto map(Brand brand) {

        if (brand == null)
            return null;

        BrandDto brandDto = new BrandDto();
        brandDto.setId(brand.getId());
        brandDto.setName(brand.getName());

        return brandDto;
    }

}
