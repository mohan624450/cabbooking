package com.genpact.cabbooking1.cabbooking1.services.impl;

import com.genpact.cabbooking1.cabbooking1.entity.Car;
import com.genpact.cabbooking1.cabbooking1.entity.CarBooking;
import com.genpact.cabbooking1.cabbooking1.entity.Driver;
import com.genpact.cabbooking1.cabbooking1.entity.User;
import com.genpact.cabbooking1.cabbooking1.repository.CarBookingRepo;
import com.genpact.cabbooking1.cabbooking1.repository.CarRepo;
import com.genpact.cabbooking1.cabbooking1.repository.DriverRepo;
import com.genpact.cabbooking1.cabbooking1.repository.userRepo;
import com.genpact.cabbooking1.cabbooking1.services.carBookingService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
@AllArgsConstructor
public class carBookingServiceImpl implements carBookingService {


    private CarRepo carRepo;

    private DriverRepo driverRepo;

    private CarBookingRepo carBookingRepo;

    private userRepo userRepo;


    @Override
    public List<Car> showAllActiveCars() {
        return carRepo.findAll();
    }

    @Override
    public List<Driver> showAllActiveDrivers() {
        return driverRepo.findAll();
    }

    @Override
    public Double calculateAmount(String fromLocation, String toLocation) {
        Random random = new Random();
        double range = 100.0 - 500.0;
        return  random.nextDouble() * range + 100.0;
    }

    @Override
    public CarBooking registerRide(String fromLocation, String toLocation, Long userId) {

        User user = userRepo.findById(userId).get();
        List<User> users = new ArrayList<>();
        users.add(user);
        List<Car> allCars = carRepo.findAll();

        CarBooking carBooking = new CarBooking();
        carBooking.setUser(users);
        carBooking.setCars(allCars);
        carBooking.setDriver(driverRepo.findAll());
        carBooking.setAmount(calculateAmount(fromLocation,toLocation));
        carBooking.setFromLocation(fromLocation);
        carBooking.setToLocation(toLocation);
        return carBookingRepo.save(carBooking);
    }
}
