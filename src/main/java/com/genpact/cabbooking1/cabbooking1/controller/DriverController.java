package com.genpact.cabbooking1.cabbooking1.controller;

import com.genpact.cabbooking1.cabbooking1.entity.Driver;
import com.genpact.cabbooking1.cabbooking1.services.DriverService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/drivers")
@AllArgsConstructor
public class DriverController {


    private DriverService driverService;

    @PostMapping("/register")
    public ResponseEntity<Driver> registerDriver(@RequestBody Driver driver) {
        Driver registeredDriver = driverService.registerDriver(driver);
        return ResponseEntity.ok(registeredDriver);
    }

    @GetMapping("/{driverId}")
    public ResponseEntity<Driver> viewDriverById(@PathVariable Long driverId) {
        Driver driver = driverService.viewDriverById(driverId);
        return ResponseEntity.ok(driver);
    }

    @PutMapping("/{driverId}")
    public ResponseEntity<Driver> updateDriverById(@PathVariable Long driverId, @RequestBody Driver updatedDriver) {
        Driver driver = driverService.updateDriverById(driverId, updatedDriver);
        return ResponseEntity.ok(driver);
    }

    @DeleteMapping("/{driverId}")
    public ResponseEntity<Void> deleteDriverById(@PathVariable Long driverId) {
        driverService.deleteDriverById(driverId);
        return ResponseEntity.noContent().build();
    }

    // Other endpoints related to Driver...
}
