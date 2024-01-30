package com.genpact.cabbooking1.cabbooking1.controller;

import com.genpact.cabbooking1.cabbooking1.entity.Car;
import com.genpact.cabbooking1.cabbooking1.entity.CarBooking;
import com.genpact.cabbooking1.cabbooking1.entity.carRequest;
import com.genpact.cabbooking1.cabbooking1.services.impl.carBookingServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/carbooking")
@AllArgsConstructor
public class carBookingController {

    private carBookingServiceImpl carBookingService;

    @PostMapping("/register")
    public ResponseEntity<CarBooking> registerCar(@RequestBody carRequest request) {
        // Add logic for user registration (validation, password hashing, etc.)
        CarBooking carBooking = carBookingService.registerRide(request.getFromLocation(),request.getToLocation(),request.getUserId());
        return ResponseEntity.ok(carBooking);
    }

}
