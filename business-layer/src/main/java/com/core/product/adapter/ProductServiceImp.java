package com.core.product.adapter;



import com.core.product.dto.ProductDTO;
import com.core.product.dto.StockDTO;
import com.core.product.port.repository.ProductRepositoryPort;
import com.core.product.port.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductServiceImp implements ProductService {

    private final ProductRepositoryPort productRepository;
//    private final ProductMapper productMapper;

    @Override
    public List<ProductDTO> findProducts() {
        return productRepository.findAll();
    }

    @Override
    public ProductDTO createProduct(ProductDTO productDTO) {
        return productRepository.createProduct(productDTO);
    }

    @Override
    public void updateStock(String sku, StockDTO stockDTO) {
        var productDTO = productRepository.findBySku(sku);

        productDTO.setAmount(stockDTO.getAmount());
        productRepository.createProduct(productDTO);
        System.out.println("Entrou no metodo update");
    }
}
