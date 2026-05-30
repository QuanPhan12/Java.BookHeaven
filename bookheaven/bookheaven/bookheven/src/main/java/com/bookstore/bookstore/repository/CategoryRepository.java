package com.bookstore.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bookstore.bookstore.Model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
