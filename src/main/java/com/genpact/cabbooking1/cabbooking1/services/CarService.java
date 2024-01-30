package com.genpact.cabbooking1.cabbooking1.services;

import com.genpact.cabbooking1.cabbooking1.entity.Car;

import java.util.List;

public interface CarService {

    Car registerCar(Car car);

    Car updateCarDetails(Long carId, Car car);

    List<Car> findCars();

    void deleteCars(Long carId);

}
