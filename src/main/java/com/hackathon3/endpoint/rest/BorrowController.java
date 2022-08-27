package com.hackathon3.endpoint.rest;

import com.hackathon3.endpoint.mapper.BorrowMapper;
import com.hackathon3.endpoint.mapper.restBorrow.RestBorrow;
import com.hackathon3.model.Borrow;
import com.hackathon3.service.BorrowService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
@RequestMapping("/borrows")
public class BorrowController {
  private BorrowService service;
  private BorrowMapper mapper;
  @PostMapping
  public Borrow createBorrow(@RequestBody RestBorrow toCreate){
    return service.createBorrow(mapper.toDomain(toCreate));
  }
  @GetMapping
  public List<Borrow> getAllBorrow(){
    return service.findBorrow();
  }
}
