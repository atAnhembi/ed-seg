package br.anhembi.spring01.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.anhembi.spring01.model.Product;
import br.anhembi.spring01.repository.ProductRepo;

@RestController
@RequestMapping("/produto")
@CrossOrigin("*")
public class ProductController {

    @Autowired
    private ProductRepo repo;

    @GetMapping("/{cod}")
    public ResponseEntity<Product> getProduct(@PathVariable int cod) {
        Optional<Product> optional = repo.findById(cod);

        if(optional.isPresent()) { // se achou o produto
            return ResponseEntity.ok(optional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
