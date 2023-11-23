package ru.davydenko.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.davydenko.library.entity.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {

}
