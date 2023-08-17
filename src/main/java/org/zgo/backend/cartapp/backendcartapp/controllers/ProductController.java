package org.zgo.backend.cartapp.backendcartapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zgo.backend.cartapp.backendcartapp.services.ProductService;
import org.zgo.backend.cartapp.backendcartapp.models.entities.Product;

@RestController
public class ProductController {
    
    @Autowired
    private ProductService service;

    @GetMapping("/products")
    @CrossOrigin(origins = "http://localhost:5173")
    public List<Product> list() {
        return service.findAll();
    }
}
