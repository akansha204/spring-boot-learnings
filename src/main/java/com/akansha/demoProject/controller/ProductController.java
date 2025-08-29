package com.akansha.demoProject.controller;

import com.akansha.demoProject.model.Product;
import com.akansha.demoProject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return productService.getProducts();

    }
    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId){
        return productService.getProductById(prodId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod){
        productService.addProduct(prod);

    }
    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod){
        productService.updateProduct(prod);
    }
    @DeleteMapping("/products/{prodId}")
    public void deleteProduct( @PathVariable int prodId){
        productService.deleteProduct(prodId);
    }
}
