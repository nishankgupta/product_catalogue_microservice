package com.nishank.ProductCatalogue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.google.gson.Gson;
import com.nishank.productcatalogue.entity.Product;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class ProductCatalogueApplicationTests {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void testGetProductById() throws Exception {
        String json = mockMvc.perform(get("/product/id/1")).andExpect(status().isOk()).andReturn().getResponse()
                .getContentAsString();
        Gson gson = new Gson();
        Product product = gson.fromJson(json, Product.class);

        assertThat(product.getId()).isEqualTo(1);
    }

    @Test
    public void testGetProductByType() throws Exception {
        String json = mockMvc.perform(get("/product/type/jeans")).andExpect(status().isOk()).andReturn().getResponse()
                .getContentAsString();
        Gson gson = new Gson();
        List<?> products = gson.fromJson(json, List.class);
        assertThat(products).isNotEmpty();
    }

    @Test
    public void testGetProductByCategory() throws Exception {
        String json = mockMvc.perform(get("/product/category/sports")).andExpect(status().isOk()).andReturn()
                .getResponse().getContentAsString();
        Gson gson = new Gson();
        List<?> products = gson.fromJson(json, List.class);
        assertThat(products).isNotEmpty();
    }

    @Test
    public void testGetProductByGender() throws Exception {
        String json = mockMvc.perform(get("/product/gender/male")).andExpect(status().isOk()).andReturn().getResponse()
                .getContentAsString();
        Gson gson = new Gson();
        List<?> products = gson.fromJson(json, List.class);
        assertThat(products).isNotEmpty();
    }

    @Test
    public void testGetProductByBrand() throws Exception {
        String json = mockMvc.perform(get("/product/brand/nike")).andExpect(status().isOk()).andReturn().getResponse()
                .getContentAsString();
        Gson gson = new Gson();
        List<?> products = gson.fromJson(json, List.class);
        assertThat(products).isNotEmpty();
    }

    @Test
    public void testDeleteProduct() throws Exception {
        mockMvc.perform(delete("/product/3")).andExpect(status().isOk());
    }
}
