package com.chandrashekhar.guestservice.models;

import java.sql.Date;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Guest {
    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    private String email;
    private String phone;
    private String address;
    private Date dob;
    private String idProof;
}
