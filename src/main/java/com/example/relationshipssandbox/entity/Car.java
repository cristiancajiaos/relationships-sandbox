package com.example.relationshipssandbox.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name = "cars")
public class Car {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "car_id")
  private Long car_id;

  @Column(name = "car_model")
  private String car_model;
}
