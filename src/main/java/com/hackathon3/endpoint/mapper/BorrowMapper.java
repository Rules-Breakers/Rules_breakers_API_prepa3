package com.hackathon3.endpoint.mapper;

import com.hackathon3.endpoint.mapper.restBorrow.RestBorrow;
import com.hackathon3.model.Book;
import com.hackathon3.model.Borrow;
import com.hackathon3.service.BookService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Getter
@Setter
public class BorrowMapper {

  private BookService service;
  public Borrow toDomain(RestBorrow toCreate){
    Borrow domainBorrow = new Borrow();
    Book book = service.getBookById(toCreate.getId_book()).get();
    domainBorrow.setBook(book);
    domainBorrow.setBorrowing_date(toCreate.getBorrowing_date());
    domainBorrow.setGiving_back_date(toCreate.getGiving_back_date());
    return domainBorrow;
  }
}
