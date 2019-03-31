package com.company.homework3.entity;

public class CarModel {

    private final Long id;
    private final String modelName;
    private final String brandName;
    private final Integer generation;

    public CarModel(Long id, String modelName, String brandName, Integer generation) {
        this.id = id;
        this.modelName = modelName;
        this.brandName = brandName;
        this.generation = generation;
    }

    public CarModel(Long id, String modelName, String brandName) {
        this.id = id;
        this.modelName = modelName;
        this.brandName = brandName;
        this.generation = 1;
    }

    public CarModel(Long id, CarModel carModel) {
        this.id = id;
        this.modelName = carModel.getModelName();
        this.brandName = carModel.getBrandName();
        this.generation = carModel.getGeneration();

    }

    public Long getId() {
        return id;
    }

    public String getModelName() {
        return modelName;
    }

    public String getBrandName() {
        return brandName;
    }

    public Integer getGeneration() {
        return generation;
    }

    @Override
    public String toString() {
        return "CarModel{" +
                "id=" + id +
                ", modelName='" + modelName + '\'' +
                ", brandName=" + brandName +
                ", generation=" + generation +
                '}';
    }
}
