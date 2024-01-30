package com.genpact.cabbooking1.cabbooking1.services;

import com.genpact.cabbooking1.cabbooking1.entity.Driver;

public interface DriverService {
    public Driver registerDriver(Driver driver);
    public Driver viewDriverById(Long driverId);

    public Driver updateDriverById(Long driverId, Driver driver);

    void  deleteDriverById(Long driverId);






}
