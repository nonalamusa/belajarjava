package com.brainmatic.pos.core;

//import com.brainmatic.pos.infra.data.inmemory.ProductMemRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private ProductRepo repository;

    @Autowired
    public ProductService(ProductRepo repository) {
        this.repository = repository;
    }

    public String generateCode() {
        //ProductMemRepo repo = new ProductMemRepo();
        return "P" + (repository.getCount() + 1);
    }


    public Product newProduct() {
        Product result = new Product();
        result.setCode(generateCode());
        return result;

    }
}
