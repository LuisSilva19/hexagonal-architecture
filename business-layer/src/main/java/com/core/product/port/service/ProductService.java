package com.core.product.port.service;

import com.core.product.dto.ProductDTO;
import com.core.product.dto.StockDTO;

import java.util.List;

public interface ProductService {
    List<ProductDTO> findProducts();
    ProductDTO createProduct(ProductDTO productDTO);
    void updateStock(String sku, StockDTO stockDTO);
}
