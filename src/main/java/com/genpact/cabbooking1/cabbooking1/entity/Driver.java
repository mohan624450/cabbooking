package com.genpact.cabbooking1.cabbooking1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "drivers")
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long driverId;

    @Column(nullable = false, unique = true)
    private String drivername;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String mail;

    @Column(nullable = false)
    private String phoneNumber;


    // Other fields, getters, and setters...

}
