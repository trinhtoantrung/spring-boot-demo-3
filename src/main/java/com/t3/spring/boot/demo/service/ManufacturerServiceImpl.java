package com.t3.spring.boot.demo.service;

import com.t3.spring.boot.demo.entity.Manufacturer;
import com.t3.spring.boot.demo.repository.ManufacturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Creation of spring-boot-demo-3.
 * <p/>
 * Created by tttrinh
 * Created date 3/30/17 1:57 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */

@Service
public class ManufacturerServiceImpl implements ManufacturerService {

  @Autowired
  ManufacturerRepository manufacturerRepository;

  @Override
  @Transactional
  public Manufacturer save(Manufacturer manufacturer) {
    return manufacturerRepository.save(manufacturer);
  }
}
