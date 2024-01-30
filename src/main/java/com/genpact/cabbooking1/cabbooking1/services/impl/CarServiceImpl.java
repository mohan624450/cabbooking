package com.genpact.cabbooking1.cabbooking1.services.impl;


import com.genpact.cabbooking1.cabbooking1.entity.Car;
import com.genpact.cabbooking1.cabbooking1.repository.CarRepo;
import com.genpact.cabbooking1.cabbooking1.repository.DriverRepo;
import com.genpact.cabbooking1.cabbooking1.services.CarService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class CarServiceImpl  implements CarService {

    private CarRepo carRepo;

    @Override
    public Car registerCar(Car car) {
        Car save = carRepo.save(car);
        return save;
    }

    @Override
    public Car updateCarDetails(Long carId, Car car) {
        Car carNew = carRepo.findById(carId).get();
        carNew.setCarNumber(car.getCarNumber());
        carNew.setCarType(car.getCarType());
        return carRepo.save(carNew);
    }

    @Override
    public List<Car> findCars() {
        List<Car> all = carRepo.findAll();
        return all;
    }

    @Override
    public void deleteCars(Long carId) {
        carRepo.deleteById(carId);


    }
}