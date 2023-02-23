package com.ngochung.productservice.service;


import com.ngochung.productservice.dto.ProductRequest;
import com.ngochung.productservice.dto.ProductResponse;

import java.util.List;

public interface ProductService {
    void createProduct(ProductRequest productRequest);
    List<ProductResponse> getAllProducts();

}
