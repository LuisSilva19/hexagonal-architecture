package com.core.product.port.repository;



import com.core.product.dto.ProductDTO;

import java.util.List;


public interface ProductRepositoryPort {
    List<ProductDTO> findAll();
    ProductDTO createProduct(ProductDTO productDTO);
    ProductDTO findBySku(String sku);
}
