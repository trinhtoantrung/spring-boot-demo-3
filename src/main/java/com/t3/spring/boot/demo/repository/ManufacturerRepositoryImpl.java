package com.t3.spring.boot.demo.repository;

import com.t3.spring.boot.demo.entity.Manufacturer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Creation of spring-boot-demo-3.
 * <p/>
 * Created by tttrinh
 * Created date 3/30/17 1:54 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */

@Repository
public class ManufacturerRepositoryImpl implements ManufacturerRepository{

  @PersistenceContext
  EntityManager em;

  @Override
  public Manufacturer save(Manufacturer manufacturer) {
    em.persist(manufacturer);
    em.flush();
    return manufacturer;
  }
}
