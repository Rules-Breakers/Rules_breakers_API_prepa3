package com.hackathon3.endpoint.mapper.restBook;

import com.hackathon3.model.Category;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class RestBook {
  private Long id;
  private String name;
  private List<Category> category;
  private boolean available = true;
  private String auteur;
  private int page_size;
  private int borrow;
}
