package com.DataJPAauditing.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.stereotype.Repository;

import com.DataJPAauditing.Entity.Product;

@Repository
public interface ProductRepository extends RevisionRepository<Product, Integer, Integer>, JpaRepository<Product, Integer>{
 
}
