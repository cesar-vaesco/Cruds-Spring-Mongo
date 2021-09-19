package com.vaescode.productos.crud.controllers;

import java.util.List;

import com.vaescode.productos.crud.models.ProductDTO;
import com.vaescode.productos.crud.repository.IProductdDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
        RequestMethod.DELETE })
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private IProductdDAO productDao;

    @PostMapping("/product")
    public ProductDTO create(@Validated @RequestBody ProductDTO p) {
        return productDao.insert(p);
    }

    @GetMapping("/")
    public List<ProductDTO> readAll() {
        return productDao.findAll();
    }

    @PutMapping("/product/{id}")
    public ProductDTO update(@PathVariable String id, @Validated @RequestBody ProductDTO p) {
        return productDao.save(p);
    }

    @DeleteMapping("/product/{id}")
    public void delete(@PathVariable String id) {
        productDao.deleteById(id);
    }

}
