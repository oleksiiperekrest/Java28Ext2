package com.company.homework3.repository;


import com.company.homework3.entity.CarBrand;

import java.util.List;

public class CarBrandRepository {

    private List<CarBrand> carBrands;

    public CarBrandRepository(List<CarBrand> carBrands) {
        this.carBrands = carBrands;
    }

    public List<CarBrand> getCarBrands() {
        return carBrands;
    }

    public CarBrand getCarBrandById(Long id) {
        for (CarBrand carBrand : carBrands) {
            if (carBrand.getId().equals(id)) {
                return carBrand;
            }
        }
        return null;
    }
}
