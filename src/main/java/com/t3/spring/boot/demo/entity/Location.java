package com.t3.spring.boot.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

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

  @OneToMany(mappedBy = "location")
  @JsonBackReference
  private List<Manufacturer> manufacturers;

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

  public List<Manufacturer> getManufacturers() {
    return manufacturers;
  }

  public void setManufacturers(List<Manufacturer> manufacturers) {
    this.manufacturers = manufacturers;
  }
}
