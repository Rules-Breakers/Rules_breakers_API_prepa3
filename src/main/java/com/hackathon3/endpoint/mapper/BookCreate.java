package com.hackathon3.endpoint.mapper;

import com.hackathon3.model.NewBook;

import java.util.ArrayList;
import java.util.List;
import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class BookCreate {
    private Long id;
    private List<NewBook> drinks = new ArrayList<>();
}
