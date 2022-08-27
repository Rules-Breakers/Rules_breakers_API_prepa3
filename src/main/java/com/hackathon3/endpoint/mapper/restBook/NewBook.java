package com.hackathon3.endpoint.mapper.restBook;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class NewBook {
    private String name;
    private List<NewCategory> category;
    private boolean available = true;
    private String auteur;
    private int page_size;
}
