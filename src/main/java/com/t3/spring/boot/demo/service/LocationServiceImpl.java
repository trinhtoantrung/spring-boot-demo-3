package com.t3.spring.boot.demo.service;

import com.t3.spring.boot.demo.entity.Location;
import com.t3.spring.boot.demo.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Creation of spring-boot-demo-3.
 * <p/>
 * Created by tttrinh
 * Created date 3/29/17 5:40 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */

@Service
public class LocationServiceImpl implements LocationService {
  @Autowired
  LocationRepository locationRepository;

  @Override
  @Transactional
  public Location save(Location location) {
    return locationRepository.save(location);
  }
}
