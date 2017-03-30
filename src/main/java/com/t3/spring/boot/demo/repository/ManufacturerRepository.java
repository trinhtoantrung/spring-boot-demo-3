package com.t3.spring.boot.demo.repository;

import com.t3.spring.boot.demo.entity.Manufacturer;

/**
 * Creation of spring-boot-demo-3.
 * <p/>
 * Created by tttrinh
 * Created date 3/30/17 1:53 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public interface ManufacturerRepository {
  Manufacturer save(Manufacturer manufacturer);
}
