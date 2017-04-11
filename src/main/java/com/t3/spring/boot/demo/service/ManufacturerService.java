package com.t3.spring.boot.demo.service;

import com.t3.spring.boot.demo.entity.Manufacturer;
import com.t3.spring.boot.demo.projection.ManufacturerProjection;

/**
 * Creation of spring-boot-demo-3.
 * <p/>
 * Created by tttrinh
 * Created date 3/30/17 1:56 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public interface ManufacturerService {
  Manufacturer save(Manufacturer manufacturer);
  Manufacturer find(Long id);

  ManufacturerProjection findAndView(Long id);
}
