package com.company.homework3.service;

import com.company.homework3.entity.CarModel;
import com.company.homework3.repository.CarModelRepository;

import java.util.ArrayList;
import java.util.List;

public class CarModelService {
    private CarModelRepository carModelRepository;

    public CarModelService(CarModelRepository carModelRepository) {
        this.carModelRepository = carModelRepository;
    }

    public List<CarModel> getCarModels() {
        return carModelRepository.getCarModels();
    }

    public CarModel getCarModelById(Long id) {
        return carModelRepository.getCarModelById(id);
    }

    public List<CarModel> getCarModelsByName(String modelName) {
        List<CarModel> result = new ArrayList<>();
        boolean found = false;
        for (CarModel carModel : getCarModels()) {
            if (carModel.getModelName().equals(modelName)) {
                result.add(carModel);
                found = true;
            }
        }
        if (found) {
            return result;
        }
        else {
            return null;
        }


    }

    public List<CarModel> getCarModelsByBrandName(String brandName) {
        return carModelRepository.getCarModelsByBrandName(brandName);
    }
}
