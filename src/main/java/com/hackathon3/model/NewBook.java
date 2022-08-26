package com.hackathon3.model;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class NewBook {
    private Long id_category;
    private String name;
    private boolean available = true;
    private String auteur;
    private int borrow;
    private int page_size;
}
