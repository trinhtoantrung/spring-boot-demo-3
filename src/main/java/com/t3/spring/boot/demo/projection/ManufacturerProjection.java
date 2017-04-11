package com.t3.spring.boot.demo.projection;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Creation of spring-boot-demo-3.
 * <p/>
 * Created by tttrinh
 * Created date 4/11/17 5:36 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
public class ManufacturerProjection {
  private String name;
  private Boolean active;
  private String state;
  private String country;

  public ManufacturerProjection(String name, Boolean active, String state, String country) {
    this.name = name;
    this.active = active;
    this.state = state;
    this.country = country;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
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
