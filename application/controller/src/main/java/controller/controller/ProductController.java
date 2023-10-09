package com.application.controller;


import com.core.product.dto.ProductDTO;
import com.core.product.dto.StockDTO;
import com.core.product.port.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productServicePort;

    @PostMapping
    void createProduct(@RequestBody ProductDTO productDTO) {
        var product = productServicePort.createProduct(productDTO);
        System.out.println(product);
    }

    @GetMapping
    List<ProductDTO> getProduct() {
        return productServicePort.findProducts();
    }

    @PutMapping(value = "/{sku}")
    void updateStock(@PathVariable String sku, @RequestBody StockDTO stockDTO) {
        productServicePort.updateStock(sku, stockDTO);
    }
}

