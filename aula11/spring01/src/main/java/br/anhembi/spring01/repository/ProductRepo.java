package br.anhembi.spring01.repository;

import org.springframework.data.repository.CrudRepository;

import br.anhembi.spring01.model.Product;

// CRUD = Create, Read, Update, Delete
public interface ProductRepo extends CrudRepository<Product, Integer> {

}
