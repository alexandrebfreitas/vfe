package com.valorfuturoenergia.vfe.repositories;

import com.valorfuturoenergia.vfe.entities.Product;
import com.valorfuturoenergia.vfe.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
