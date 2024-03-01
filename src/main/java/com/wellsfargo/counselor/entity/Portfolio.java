package com.wellsfargo.counselor.entity;

import javax.persistence.*;
@Entity
public class Portfolio {
    import javax.persistence.*;

    @Entity
    public class Portfolio {

        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private int id;

        @OneToOne
        @JoinColumn(name="client_id")
        private Client client;

        // constructor and getters/setters

}
