package com.genpact.cabbooking1.cabbooking1.services;

import com.genpact.cabbooking1.cabbooking1.entity.Car;
import com.genpact.cabbooking1.cabbooking1.entity.CarBooking;
import com.genpact.cabbooking1.cabbooking1.entity.Driver;
import com.genpact.cabbooking1.cabbooking1.entity.User;

import java.util.List;

public interface carBookingService {

    List<Car> showAllActiveCars();

    List<Driver> showAllActiveDrivers();

    Double calculateAmount(String fromLoation, String toLocation);

    CarBooking registerRide(String fromLoation, String toLocation,Long userId);

}
