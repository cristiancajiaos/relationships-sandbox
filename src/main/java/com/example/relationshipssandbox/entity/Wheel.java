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
@Table(name = "wheels")
public class Wheel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "wheel_id")
  private Long wheel_id;

  @OneToMany
  @JoinColumn(name = "card_id_fk")
  private List<Car> car;
}
