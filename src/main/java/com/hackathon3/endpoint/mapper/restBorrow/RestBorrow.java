package com.hackathon3.endpoint.mapper.restBorrow;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class RestBorrow {
  private Long id_book;
  private Date borrowing_date;
  private Date giving_back_date;
}
