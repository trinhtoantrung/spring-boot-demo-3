package com.t3.spring.boot.demo.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Creation of spring-boot-demo-3.
 * <p/>
 * Created by tttrinh
 * Created date 3/30/17 11:04 AM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */

@Entity
public class Manufacturer {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String name;
  private Boolean active;

  private Date foundeddate;

  private BigDecimal averageyearlysales;

  @ManyToOne
  @JoinColumn(name = "location_id")
  @JsonManagedReference
  private Location location;

  public Manufacturer() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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

  public Date getFoundeddate() {
    return foundeddate;
  }

  public void setFoundeddate(Date foundeddate) {
    this.foundeddate = foundeddate;
  }

  public BigDecimal getAverageyearlysales() {
    return averageyearlysales;
  }

  public void setAverageyearlysales(BigDecimal averageyearlysales) {
    this.averageyearlysales = averageyearlysales;
  }

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }
}
