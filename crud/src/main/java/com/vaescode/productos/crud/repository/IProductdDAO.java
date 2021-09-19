package com.vaescode.productos.crud.repository;

import com.vaescode.productos.crud.models.ProductDTO;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductdDAO extends MongoRepository<ProductDTO, String> {

}
