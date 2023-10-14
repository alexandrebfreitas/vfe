package com.valorfuturoenergia.vfe.repositories;

import com.valorfuturoenergia.vfe.entities.Category;
import com.valorfuturoenergia.vfe.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
