package com.t3.spring.boot.demo.service;

import com.t3.spring.boot.demo.entity.Location;

/**
 * Creation of spring-boot-demo-3.
 * <p/>
 * Created by tttrinh
 * Created date 3/29/17 5:39 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public interface LocationService {
  Location save(Location location);
  Location find(Long id);
}
