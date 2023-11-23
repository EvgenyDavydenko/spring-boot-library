package ru.davydenko.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.davydenko.library.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
