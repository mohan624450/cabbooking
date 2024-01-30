package com.genpact.cabbooking1.cabbooking1.services.impl;

import com.genpact.cabbooking1.cabbooking1.entity.Driver;
import com.genpact.cabbooking1.cabbooking1.entity.User;
import com.genpact.cabbooking1.cabbooking1.repository.DriverRepo;
import com.genpact.cabbooking1.cabbooking1.services.DriverService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class DriverSeriveImpl implements DriverService {

    private DriverRepo driverRepo;
    @Override
    public Driver registerDriver(Driver driver) {
        return driverRepo.save(driver);
    }

    @Override
    public Driver viewDriverById(Long driverId) {
        Optional<Driver> optional=driverRepo.findById(driverId);
        return optional.orElseThrow();

    }

    @Override
    public Driver updateDriverById(Long dirverId, Driver driver) {
//        Long driverId = driver.getDriverId();
        Optional<Driver> byId = driverRepo.findById(dirverId);
        Driver driver1 = byId.get();
        driver1.setMail(driver.getMail());
        driver1.setPhoneNumber(driver.getPhoneNumber());
        return driverRepo.save(driver1);

    }

    @Override
    public void deleteDriverById(Long driverId) {
        driverRepo.deleteById(driverId);
    }
}
