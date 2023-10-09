package com.infrastructure.repository.impl;

import com.core.product.dto.ProductDTO;
import com.core.product.port.repository.ProductRepositoryPort;
import com.infrastructure.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductRepositoryPortImpl implements ProductRepositoryPort {

    private final ProductRepository productRepository;

    @Override
    public List<ProductDTO> findAll() {
        var prod = productRepository.findAll();
        return prod.stream()
                .map(p -> ProductDTO.builder()
                        .name(p.getName())
                        .value(p.getValue())
                        .amount(p.getAmount())
                        .sku(p.getSku())
                        .build())
                .toList();
    }

    @Override
    public ProductDTO createProduct(ProductDTO productDTO) {
        return null;
    }

    @Override
    public ProductDTO findBySku(String sku) {
        return null;
    }
}
