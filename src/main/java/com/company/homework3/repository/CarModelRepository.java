package com.company.homework3.repository;

import com.company.homework3.entity.CarModel;

import java.util.ArrayList;
import java.util.List;

public class CarModelRepository {

    List<CarModel> carModels;

    public CarModelRepository(List<CarModel> carModels) {
        this.carModels = carModels;
    }

    public List<CarModel> getCarModels() {
        return carModels;
    }

    public CarModel getCarModelById(Long id) {
        for (CarModel carModel : carModels) {
            if (carModel.getId().equals(id)) {
                return carModel;
            }
        }
        return null;
    }

    public List<CarModel> getCarModelsByBrandName(String brandName) {
        List<CarModel> result = new ArrayList<>();
        boolean found = false;
        for (CarModel carModel : carModels) {
            if (carModel.getBrandName().equals(brandName)) {
                result.add(carModel);
                found = true;
            }
        }
        if (found) {
            return result;
        } else {
            return null;
        }
    }
}
