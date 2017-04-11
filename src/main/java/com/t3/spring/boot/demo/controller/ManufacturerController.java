package com.t3.spring.boot.demo.controller;

import com.t3.spring.boot.demo.entity.Location;
import com.t3.spring.boot.demo.entity.Manufacturer;
import com.t3.spring.boot.demo.service.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
public class ManufacturerController {
  @Autowired
  ManufacturerService manufacturerService;

  @RequestMapping(value = "manufacturer/{id}", method = RequestMethod.GET)
  public Manufacturer find(@PathVariable Long id) {
    return manufacturerService.find(id);
  }

  @RequestMapping(value = "manufacturer/{id}/location", method = RequestMethod.GET)
  public Location getLocation(@PathVariable Long id) {
    if(manufacturerService.find(id) != null) {
      return manufacturerService.find(id).getLocation();
    } else {
      return null;
    }
  }

  @RequestMapping(value = "manufacturer", method = RequestMethod.POST)
  public Manufacturer save(@RequestBody Manufacturer manufacturer) {
    return manufacturerService.save(manufacturer);
  }
}
