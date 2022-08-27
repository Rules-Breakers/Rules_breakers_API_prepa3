package com.hackathon3.repository;

import com.hackathon3.model.Book;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BookRepo extends JpaRepository<Book, Long> {
    List<Book> findBookByAvailable(Pageable pageable , boolean available);
}
