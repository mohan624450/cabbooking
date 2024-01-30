package com.genpact.cabbooking1.cabbooking1.repository;

import com.genpact.cabbooking1.cabbooking1.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepo extends JpaRepository<Driver, Long> {
}
