package com.wellsfargo.counselor.entity;

import javax.persistence.*;
@Entity
public class Security {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name="portfolio_id")
    private Portfolio portfolio;

    // other fields, constructor, getters/setters
}
