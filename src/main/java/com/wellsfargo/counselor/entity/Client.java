package com.wellsfargo.counselor.entity;

import javax.persistence.*;
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @Column
    private String name;

    @Column
    private String contactInfo;

    @ManyToOne
    @JoinColumn(name="advisor_id")
    private FinancialAdvisor advisor;

    public Client() {}

    public Client(String name, String contactInfo, FinancialAdvisor advisor) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.advisor = advisor;
    }

    // getters and setters

}
