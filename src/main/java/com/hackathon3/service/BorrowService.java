package com.hackathon3.service;


import com.hackathon3.model.Borrow;
import com.hackathon3.repository.BorrowRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BorrowService {
  private BorrowRepository repository;
  public Borrow createBorrow(Borrow newBorrow){
    return repository.save(newBorrow);
  }
  public List<Borrow> findBorrow(){
    return repository.findAll();
  }
}
