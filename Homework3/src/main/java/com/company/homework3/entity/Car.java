package com.company.homework3.entity;

/**
 * Car: id, Марка, Модель, Год выпуска, Цвет, Цена, Регистрационный номер.
 */
public class Car {

    private final Long id;
    private final CarBrand brand;
    private final CarModel model;
    private final Integer year;
    private String color;
    private Integer price;
    private String regNumber;


    public Car(Long id, CarBrand brand, CarModel model, Integer year, String color, Integer price, String regNumber) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.regNumber = regNumber;
    }

    public Car(Long id, Car car) {
        this.id = id;
        this.brand = car.getBrand();
        this.model = car.getModel();
        this.year = car.getYear();
        this.color = car.getColor();
        this.price = car.getPrice();
        this.regNumber = car.getRegNumber();
    }

    public Long getId() {
        return id;
    }

    public CarBrand getBrand() {
        return brand;
    }

    public CarModel getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public Integer getPrice() {
        return price;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand=" + brand.getBrandName() +
                ", model=" + model.getModelName() +
                ", generation=" + model.getGeneration() +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", regNumber='" + regNumber + '\'' +
                '}';
    }
}
