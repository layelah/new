package com.example.sb_car_2.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String brand, model, color, registrationNumber;
    private int year, price;

    // Constructeurs
    public Car() {}
    public Car(String brand, String model, String color, String registrationNumber, int year, int price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.registrationNumber = registrationNumber;
        this.year = year;
        this.price = price;
    }

    // Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public String getRegistrationNumber() { return registrationNumber; }
    public void setRegistrationNumber(String registrationNumber) { this.registrationNumber = registrationNumber; }
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }
}