package com.company.homework3.entity;

import java.util.List;

public class CarBrand {

    private final Long id;
    private final String brandName;
    private List<CarModel> carModels;

    public CarBrand(Long id, String brandName, List<CarModel> carModels) {
        this.id = id;
        this.brandName = brandName;
        this.carModels = carModels;
    }

    public CarBrand(Long id, CarBrand carBrand) {
        this.id = id;
        this.brandName = carBrand.getBrandName();
        this.carModels = carBrand.getCarModels();
    }

    public Long getId() {
        return id;
    }

    public String getBrandName() {
        return brandName;
    }

    public List<CarModel> getCarModels() {
        return carModels;
    }

    public void setCarModels(List<CarModel> carModels) {
        this.carModels = carModels;
    }

    @Override
    public String toString() {
        return "CarBrand{" +
                "id=" + id +
                ", brandName='" + brandName + '\'' +
                ", carModels=" + carModels +
                '}';
    }
}
