package com.sukhyna.service;

import com.sukhyna.dao.CategoryRepository;
import com.sukhyna.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Optional<List<Category>> getAll() {
        return Optional.of(categoryRepository.findAll());
    }

    @Override
    public Optional<Category> create(Category category) {
        return Optional.of(categoryRepository.save(category));
    }

    @Override
    public Optional<Category> getById(Long id) {
        return categoryRepository.findById(id);
    }

    @Override
    public Optional<Category> update(Category category) {
        return Optional.of(categoryRepository.save(category));
    }

    @Override
    public void delete(Long id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public Optional<Category> getByIdWithProducts(Long id) {
        return categoryRepository.getById(id);
    }

//    @Override
//    public Optional<List<Category>> getAllWithProducts() {
//        return categoryRepository.getAll();
//    }
}