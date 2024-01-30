package com.genpact.cabbooking1.cabbooking1.entity;

import com.genpact.cabbooking1.cabbooking1.services.DriverService;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="car_bookings")
public class CarBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;

    @Column(nullable = false)
    private String fromLocation;

    @Column(nullable = false)
    private String toLocation;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Car> cars;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Driver> driver;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<User> user;


    private Double amount;






}
