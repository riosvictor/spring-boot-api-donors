package com.api.donors.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "donors")
public class Donor {
    @Id
    private String id;
    private String name;
    private String email;
    private String blood;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public Donor() {
    }

    public Donor(String id, String name, String email, String blood) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.blood = blood;
    }
}