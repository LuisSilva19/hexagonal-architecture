package com.core.product.mapper;

import com.core.product.domain.Product;
import com.core.product.dto.ProductDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    ProductDTO productToProductDTO(Product product);
    Product productDTOToProduct(ProductDTO productDTO);
    List<ProductDTO> productToProductDTO(List<Product> product);
    List<Product> productDTOToProduct(List<ProductDTO> productDTO);
}
