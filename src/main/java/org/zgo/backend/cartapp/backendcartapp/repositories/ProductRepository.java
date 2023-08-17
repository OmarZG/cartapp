package org.zgo.backend.cartapp.backendcartapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.zgo.backend.cartapp.backendcartapp.models.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
    
}
