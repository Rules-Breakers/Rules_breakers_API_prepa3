package com.hackathon3.service;


import com.hackathon3.endpoint.mapper.restBorrow.RestBorrow;
import com.hackathon3.model.Book;
import com.hackathon3.model.Borrow;
import com.hackathon3.repository.BookRepo;
import com.hackathon3.repository.BorrowRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BorrowService {
  private BorrowRepository repository;
  public Borrow createBorrow(Borrow newBorrow){
    return repository.save(newBorrow);
  }
  public Object[] historyBorrow(Long id){
    return repository.history(id);
  }
  public List<Borrow> findBorrow(){
    return repository.findAll();
  }
}
