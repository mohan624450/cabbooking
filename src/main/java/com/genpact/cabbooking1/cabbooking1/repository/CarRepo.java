package com.genpact.cabbooking1.cabbooking1.repository;

import com.genpact.cabbooking1.cabbooking1.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepo extends JpaRepository<Car,Long> {

}
