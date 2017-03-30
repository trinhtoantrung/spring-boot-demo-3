package com.t3.spring.boot.demo.service;

import com.t3.spring.boot.demo.DemoApplication;
import com.t3.spring.boot.demo.entity.Location;
import com.t3.spring.boot.demo.entity.Manufacturer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * Creation of spring-boot-demo-3.
 * <p/>
 * Created by tttrinh
 * Created date 3/30/17 2:12 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ManufacturerServiceTestIntegration {
  @Autowired
  ManufacturerService manufacturerService;

  @Autowired
  LocationService locationService;

  @Test
  public void save() throws Exception {
    Manufacturer newManufacturer = new Manufacturer();
    newManufacturer.setActive(true);
    newManufacturer.setName("Trinh Toan Trung");
    newManufacturer.setFoundeddate(new Date());
    newManufacturer.setAverageyearlysales(new BigDecimal(12.24));

    Location location = locationService.find(1L);
    if (location != null) {
      newManufacturer.setLocation(location);
    }

    Manufacturer returnedManufacturerService = manufacturerService.save(newManufacturer);
    System.out.println(returnedManufacturerService.getId() +
                      " - " + returnedManufacturerService.getActive() +
                      " - " + returnedManufacturerService.getFoundeddate() +
                      " - " + returnedManufacturerService.getAverageyearlysales() +
                      " - " + returnedManufacturerService.getName() +
                      " - " + returnedManufacturerService.getLocation().getId());

    assertNotNull(returnedManufacturerService.getId());
  }

}