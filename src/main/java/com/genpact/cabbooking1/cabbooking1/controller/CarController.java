package com.genpact.cabbooking1.cabbooking1.controller;

import com.genpact.cabbooking1.cabbooking1.entity.Car;
import com.genpact.cabbooking1.cabbooking1.entity.User;
import com.genpact.cabbooking1.cabbooking1.services.CarService;
import com.genpact.cabbooking1.cabbooking1.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
@AllArgsConstructor
public class CarController {

    private CarService carService;


    @PostMapping("/register")
    public ResponseEntity<Car> registerCar(@RequestBody Car car) {
        // Add logic for user registration (validation, password hashing, etc.)
        System.out.println(car.toString());
        System.out.println(car.getCarNumber());
        Car registeredCar = carService.registerCar(car);
        return ResponseEntity.ok(registeredCar);
    }

    @DeleteMapping("/{carId}")
    public ResponseEntity<Void> deleteCar(@PathVariable Long carId) {
        carService.deleteCars(carId);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{userId}")
    public ResponseEntity<Car> updateCar( @RequestBody Long carId, Car car) {
        Car car1 = carService.updateCarDetails(carId, car);
        return ResponseEntity.ok(car1);
    }

    @GetMapping("/allUsers")
    public ResponseEntity<List<Car>> getAllCars() {
        List<Car> cars = carService.findCars();
        return ResponseEntity.ok(cars);
    }
}
