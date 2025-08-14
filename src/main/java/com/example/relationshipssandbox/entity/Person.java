package com.example.relationshipssandbox.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name = "people")
public class Person {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long person_id;

  @ManyToMany
  @JoinTable(
      name = "person_car",
      joinColumns = { @JoinColumn(name = "person_id_fk")},
      inverseJoinColumns = { @JoinColumn(name = "car_id_fk")})
  private List<Car> cars;

}
