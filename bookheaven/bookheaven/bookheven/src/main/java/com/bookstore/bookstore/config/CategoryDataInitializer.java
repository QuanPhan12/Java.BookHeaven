package com.bookstore.bookstore.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bookstore.bookstore.Model.Category;
import com.bookstore.bookstore.repository.CategoryRepository;

@Component
public class CategoryDataInitializer implements CommandLineRunner {

    private final CategoryRepository categoryRepository;

    public CategoryDataInitializer(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) {
        if (categoryRepository.count() > 0) {
            return;
        }
        String[] names = {
            "Văn học",
            "Khoa học viễn tưởng",
            "Lập trình & Công nghệ",
            "Phát triển bản thân",
            "Kinh doanh"
        };
        for (String name : names) {
            categoryRepository.save(Category.builder().name(name).build());
        }
    }
}
