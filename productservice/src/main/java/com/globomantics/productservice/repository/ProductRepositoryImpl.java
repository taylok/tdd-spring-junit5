package com.globomantics.productservice.repository;

import com.globomantics.productservice.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    @Override
    public Optional<Product> findById( Integer id ) {
        return Optional.empty();
    }

    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public boolean update( Product product ) {
        return false;
    }

    @Override
    public Product save( Product product ) {
        return null;
    }

    @Override
    public boolean delete( Integer id ) {
        return false;
    }


}
