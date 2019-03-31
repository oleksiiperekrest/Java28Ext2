package com.company.homework3.service;

import com.company.homework3.entity.CarBrand;
import com.company.homework3.repository.CarBrandRepository;

import java.util.List;

public class CarBrandService {
    CarBrandRepository carBrandRepository;

    public CarBrandService(CarBrandRepository carBrandRepository) {
        this.carBrandRepository = carBrandRepository;
    }

    public List<CarBrand> getCarBrands() {
        return carBrandRepository.getCarBrands();
    }

    public CarBrand getCarBrandById(Long id) {
        return carBrandRepository.getCarBrandById(id);
    }

    public CarBrand getCarBrandByName(String name) {
        for (CarBrand carBrand : carBrandRepository.getCarBrands()) {
            if (carBrand.getBrandName().equals(name)) {
                return carBrand;
            }
        }
        return null;
    }
}
