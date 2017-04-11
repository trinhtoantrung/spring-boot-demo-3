package com.t3.spring.boot.demo.repository;

import com.t3.spring.boot.demo.entity.Manufacturer;
import com.t3.spring.boot.demo.projection.ManufacturerProjection;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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

  @Override
  public Manufacturer find(Long id) {
    return em.find(Manufacturer.class, id);
  }

  @Override
  public ManufacturerProjection findAndView(Long id) {
    Query jpql = em.createQuery("SELECT NEW com.t3.spring.boot.demo.projection.ManufacturerProjection(" +
                                "m.name, m.active, l.state, l.country) " +
                                "FROM Manufacturer m, Location l " +
                                "WHERE m.location.id = l.id and m.id = :id");
    jpql.setParameter("id", id);
    return (ManufacturerProjection) jpql.getSingleResult();
  }
}
