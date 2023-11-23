package ru.davydenko.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.davydenko.library.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
