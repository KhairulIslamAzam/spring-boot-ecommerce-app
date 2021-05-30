package com.example.ecommerce.repository;

import com.example.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Khairul Islam Azam
 * @since 1.0.0
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
}
