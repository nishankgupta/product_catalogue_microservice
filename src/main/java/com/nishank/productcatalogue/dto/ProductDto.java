package com.nishank.productcatalogue.dto;

import java.util.List;

import com.nishank.productcatalogue.enums.Category;
import com.nishank.productcatalogue.enums.Gender;
import com.nishank.productcatalogue.enums.Type;

public class ProductDto {

    private int id;
    private String name;
    private Type type;
    private Gender gender;
    private Category category;
    private BrandDto brand;
    private List<ProductSizeDto> productSizes;
    private List<ProductColorDto> productColor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public BrandDto getBrand() {
        return brand;
    }

    public void setBrand(BrandDto brand) {
        this.brand = brand;
    }

    public List<ProductSizeDto> getProductSizes() {
        return productSizes;
    }

    public void setProductSizes(List<ProductSizeDto> productSizes) {
        this.productSizes = productSizes;
    }

    public List<ProductColorDto> getProductColor() {
        return productColor;
    }

    public void setProductColor(List<ProductColorDto> productColor) {
        this.productColor = productColor;
    }

}
