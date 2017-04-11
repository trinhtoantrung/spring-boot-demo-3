package com.t3.spring.boot.demo.controller;

import com.t3.spring.boot.demo.entity.Location;
import com.t3.spring.boot.demo.entity.Manufacturer;
import com.t3.spring.boot.demo.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Creation of spring-boot-demo-3.
 * <p/>
 * Created by tttrinh
 * Created date 3/30/17 5:14 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */

@RestController
@RequestMapping("services/")
public class LocationController {
  @Autowired
  LocationService locationService;

  @RequestMapping(value = "location/{id}", method = RequestMethod.GET)
  public Location find(@PathVariable Long id) {
    return locationService.find(id);
  }

  @RequestMapping(value = "location/{id}/manufacturer", method = RequestMethod.GET)
  public List<Manufacturer> getManufacturer(@PathVariable Long id) {
    if (locationService.find(id) != null) {
      return locationService.find(id).getManufacturers();
    }
    else {
      return null;
    }
  }

  @RequestMapping(value = "location", method = RequestMethod.POST)
  public Location save(@RequestBody Location location) {
    return locationService.save(location);
  }
}
