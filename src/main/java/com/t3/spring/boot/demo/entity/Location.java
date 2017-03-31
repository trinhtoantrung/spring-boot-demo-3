package com.t3.spring.boot.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Creation of spring-boot-demo-3.
 * <p/>
 * Created by tttrinh
 * Created date 3/29/17 3:17 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */

@Entity
public class Location {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String state;
  private String country;

  public Location() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }
}
