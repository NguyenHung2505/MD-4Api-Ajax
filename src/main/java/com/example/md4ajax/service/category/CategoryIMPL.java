package com.example.md4ajax.service.category;


import com.example.md4ajax.model.Category;
import com.example.md4ajax.repository.CategogyRepository;
import com.example.md4ajax.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryIMPL implements CategoryService {
@Autowired
    CategogyRepository categogyRepository;

    @Override
    public List<Category> findAll() {
        return categogyRepository.findAll();
    }

    @Override
    public Optional<Category> findById(Long id) {
        return categogyRepository.findById(id);
    }

    @Override
    public void save(Category category) {
        categogyRepository.save(category);
    }

    @Override
    public void remove(Long id) {
        categogyRepository.deleteById(id);
    }
}
