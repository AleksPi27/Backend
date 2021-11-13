package com.marketplace.fairmarket.service;

import com.marketplace.fairmarket.model.Product;
import com.marketplace.fairmarket.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> getAllProducts(){
        List<Product> allProducts= productRepository.findAll();
        allProducts.removeIf(product -> product.getRating()<4.0);
        allProducts.sort(Collections.reverseOrder());
        return allProducts;
    }

    public List<Product> getAllProductsInCategory(String category){
        List<Product> allProducts= productRepository.findAll();
        allProducts.removeIf(product -> !product.getCategory().equals(category));
        return allProducts;
    }

    public Optional<List<Product>> getAllProductsWithNameContainingSearchString(String searchString){
        return productRepository.findAllByNameRegex(searchString);
    }
}
