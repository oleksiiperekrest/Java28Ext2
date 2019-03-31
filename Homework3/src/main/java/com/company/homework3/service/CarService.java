package com.company.homework3.service;


import com.company.homework3.entity.Car;
import com.company.homework3.entity.CarBrand;
import com.company.homework3.entity.CarModel;
import com.company.homework3.repository.CarRepository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CarService {

    private CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getCars() {
        return carRepository.getCars();
    }

    public Car getCarById(Long id) {
        return carRepository.getCarById(id);
    }

    public List<Car> getCarsByBrand(CarBrand brand) {
        List<Car> result = new ArrayList<>();
        boolean found = false;

        for (Car car : carRepository.getCars()) {
            if (car.getBrand().equals(brand)) {
                result.add(car);
                found = true;
            }
        }
        if (found) {
            return result;
        } else {
            return null;
        }
    }

    public List<Car> filterByBrand(List<Car> cars, CarBrand brand) {
        List<Car> result = new ArrayList<>();
        boolean found = false;

        for (Car car : cars) {
            if (car.getBrand().equals(brand)) {
                result.add(car);
                found = true;
            }
        }
        if (found) {
            return result;
        } else {
            return null;
        }

    }

    public List<Car> getCarsByModels(List<CarModel> carModels) {
        List<Car> result = new ArrayList<>();
        boolean found = false;
        for (CarModel carModel : carModels) {
        for (Car car : carRepository.getCars()) {
            if (car.getModel().equals(carModel)) {
                result.add(car);
                found = true;
            }
        }}
        if (found) {
            return result;
        } else {
            return null;
        }
    }

    public List<Car> getCarsByModel(CarModel carModel) {
        List<Car> result = new ArrayList<>();
        boolean found = false;

        for (Car car : carRepository.getCars()) {
            if (car.getModel().equals(carModel)) {
                result.add(car);
                found = true;
            }
        }
        if (found) {
            return result;
        } else {
            return null;
        }
    }

    public List<Car> filterByModel(List<Car> cars, CarModel model) {
        List<Car> result = new ArrayList<>();
        boolean found = false;

        for (Car car : cars) {
            if (car.getModel().equals(model)) {
                result.add(car);
                found = true;
            }
        }
        if (found) {
            return result;
        } else {
            return null;
        }

    }

    public List<Car> getCarsByYear(int year) {
        List<Car> result = new ArrayList<>();
        boolean found = false;

        for (Car car : carRepository.getCars()) {
            if (car.getYear().equals(year)) {
                result.add(car);
                found = true;
            }
        }
        if (found) {
            return result;
        } else {
            return null;
        }
    }

    public List<Car> filterByYear(List<Car> cars, int year) {
        List<Car> result = new ArrayList<>();
        boolean found = false;

        for (Car car : cars) {
            if (car.getYear().equals(year)) {
                result.add(car);
                found = true;
            }
        }
        if (found) {
            return result;
        } else {
            return null;
        }

    }


    public List<Car> filterOlder (List<Car> cars, int age) {
        int thisYear = Calendar.getInstance().get(Calendar.YEAR);
        List<Car> result = new ArrayList<>();
        boolean found = false;
        for (Car car : cars) {
            if (thisYear - car.getYear() > age) {
                result.add(car);
                found = true;
            }
        }
        if (found) {
            return result;
        } else {
            return null;
        }
    }

    public List<Car> filterPriceMore(List<Car> cars, int price) {


        List<Car> result = new ArrayList<>();

        boolean found = false;
        for (Car car : cars) {
            if (car.getPrice() > price) {
                result.add(car);
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
