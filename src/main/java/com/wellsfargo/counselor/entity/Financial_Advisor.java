package com.wellsfargo.counselor.entity;

import javax.persistence.*;
@Entity
public class Financial_Advisor {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @Column
    private String name;

    @Column
    private String contactInfo;

    public Financial_Advisor() {}

    public Financial_Advisor(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

}
