package org.chandima.backend.service;

import org.chandima.backend.model.Product;
import org.chandima.backend.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;
    public List<Product> getAllProducts() {
       return productRepo.findAll();
    }
}
