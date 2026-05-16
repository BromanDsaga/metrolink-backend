package com.metrolink.backend.service;

import com.metrolink.backend.entity.Product;
import com.metrolink.backend.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Page<Product> getProducts(String query, Integer categoryId, int page, int size) {
        Pageable pageable = PageRequest.of(page, size, Sort.by("createdAt").descending());

        if (query != null && !query.isBlank()) {
            return productRepository
                    .findByNameContainingIgnoreCaseOrDescriptionContainingIgnoreCase(query, query, pageable);
        }

        if (categoryId != null) {
            return productRepository.findByCategoryId(categoryId, pageable);
        }

        return productRepository.findAll(pageable);
    }

    public Product getProductById(UUID id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(UUID id, Product updated) {
        Product existing = getProductById(id);
        existing.setName(updated.getName());
        existing.setDescription(updated.getDescription());
        existing.setPrice(updated.getPrice());
        existing.setStock(updated.getStock());
        existing.setImageUrl(updated.getImageUrl());
        existing.setCategory(updated.getCategory());
        return productRepository.save(existing);
    }

    public void deleteProduct(UUID id) {
        productRepository.deleteById(id);
    }
}