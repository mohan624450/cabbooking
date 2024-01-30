package com.genpact.cabbooking1.cabbooking1.repository;

import com.genpact.cabbooking1.cabbooking1.entity.CarBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarBookingRepo extends JpaRepository<CarBooking,Long> {
}
