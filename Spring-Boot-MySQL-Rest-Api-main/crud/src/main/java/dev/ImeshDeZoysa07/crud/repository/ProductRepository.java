package dev.ImeshDeZoysa07.crud.repository;

import dev.ImeshDeZoysa07.crud.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
