
package com.t3.spring.boot.demo.service;

import com.t3.spring.boot.demo.DemoApplication;
import com.t3.spring.boot.demo.entity.Location;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Creation of spring-boot-demo-3.
 * <p/>
 * Created by tttrinh
 * Created date 3/29/17 5:46 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class LocationServiceTestIntegrationTest {
  @Autowired
  LocationService locationService;

  @Test
  public void testSave() throws Exception {
    Location newLocation = new Location();
    newLocation.setState("HCM");
    newLocation.setCountry("Vietnam");

    Location returnedLocation = locationService.save(newLocation);
    assertNotNull(returnedLocation.getId());
  }
}
