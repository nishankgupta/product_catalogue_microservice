package com.nishank.productcatalogue.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.nishank.productcatalogue.dto.ProductDto;
import com.nishank.productcatalogue.enums.Category;
import com.nishank.productcatalogue.enums.Gender;
import com.nishank.productcatalogue.enums.Type;
import com.nishank.productcatalogue.service.contract.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {

    private static final Logger LOGGER = Logger.getLogger(ProductController.class);

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public ProductDto getProduct(@PathVariable(value = "id") int id) {
        LOGGER.info("Fetching product for id: " + id);

        return productService.getProduct(id);
    }

    @RequestMapping(value = "/category/{name}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<ProductDto> getProductByCategory(@PathVariable(value = "name") String name) {
        LOGGER.info("Fetching products for category: " + name);
        return productService.getProductsByCategory(name);
    }

    @RequestMapping(value = "/type/{name}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<ProductDto> getProductByType(@PathVariable(value = "name") String name) {
        LOGGER.info("Fetching products for type: " + name);
        return productService.getProductsByType(name);
    }

    @RequestMapping(value = "/gender/{name}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<ProductDto> getProductByGender(@PathVariable(value = "name") String name) {
        LOGGER.info("Fetching products for gender: " + name);
        return productService.getProductsbyGender(name);
    }

    @RequestMapping(value = "/brand/{name}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<ProductDto> getProductByBrand(@PathVariable(value = "name") String name) {
        LOGGER.info("Fetching products for brand: " + name);
        return productService.getProductsByBrand(name);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json")
    @ResponseBody
    public void deletProduct(@PathVariable(value = "id") int id) {
        LOGGER.info("Deleting product for id: " + id);
        productService.deleteProduct(id);
    }

}
