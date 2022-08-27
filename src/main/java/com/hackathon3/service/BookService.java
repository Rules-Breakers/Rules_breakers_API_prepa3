package com.hackathon3.service;

import com.hackathon3.endpoint.mapper.restBorrow.RestBorrow;
import com.hackathon3.model.Book;
import com.hackathon3.repository.BookRepo;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BookService {
  private final BookRepo bookRepo;

  public List<Book> getAll(int page, int page_size) {
    Pageable pageable = PageRequest.of(page, page_size);
    return bookRepo.findAll(pageable).toList();
  }

  public Optional<Book> getBookById(Long id) {
    return bookRepo.findById(id);
  }

  public List<Book> getBookStatus(int page, int page_size, boolean available) {
    Pageable pageable = PageRequest.of(page, page_size);
    return bookRepo.findBookByAvailable(pageable, available);
  }

  public void deleteBook(Long id) {
    boolean exist = bookRepo.findById(id).isPresent();
    if (exist) bookRepo.deleteById(id);
  }

  public Book updateBooks(RestBorrow borrow) {
    Optional<Book> book = bookRepo.findById(borrow.getId_book());
    book.get().setAvailable(true);
    return bookRepo.save(book.get());
  }

  public List<Book> saveAllBook(List<Book> toWrite) {
    return bookRepo.saveAll(toWrite);
  }
}
