package com.hackathon3.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Book implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany
    @JoinColumn(name = "id_category")
    private List<Category> category;
    private boolean available = true;
    private String auteur;
    private int borrow;
    private int page_size;

}
