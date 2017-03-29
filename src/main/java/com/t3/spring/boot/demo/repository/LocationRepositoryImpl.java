package com.t3.spring.boot.demo.repository;

import com.t3.spring.boot.demo.entity.Location;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Creation of spring-boot-demo-3.
 * <p/>
 * Created by tttrinh
 * Created date 3/29/17 3:22 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */

@Repository
public class LocationRepositoryImpl implements LocationRepository {

  @PersistenceContext
  EntityManager em;

  @Override
  public Location save(Location location) {
    em.persist(location);
    em.flush();
    return location;
  }
}
