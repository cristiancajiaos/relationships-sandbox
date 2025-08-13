package com.example.relationshipssandbox.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "engines")
public class Engine {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "engine_id")
  private Long engine_id;

  @Column(name = "engine_model")
  private String engine_model;

  @OneToOne
  @JoinColumn(name = "car_id_fk")
  private Car car;

}
