package org.zgo.backend.cartapp.backendcartapp.services;

import java.util.List;
import org.zgo.backend.cartapp.backendcartapp.models.entities.Product;

public interface ProductService {
    List<Product> findAll();
}
