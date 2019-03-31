package com.company.homework3;

import com.company.homework3.entity.Car;
import com.company.homework3.entity.CarBrand;
import com.company.homework3.entity.CarModel;
import com.company.homework3.repository.CarBrandRepository;
import com.company.homework3.repository.CarModelRepository;
import com.company.homework3.repository.CarRepository;
import com.company.homework3.service.CarBrandService;
import com.company.homework3.service.CarModelService;
import com.company.homework3.service.CarService;

import java.util.ArrayList;
import java.util.List;

public class ConsoleApp {
    public static void main(String[] args) {

        CarModelRepository carModelRepository = new CarModelRepository(initCarModels());
        CarBrandRepository carBrandRepository = new CarBrandRepository(initCarBrands(carModelRepository));
        CarRepository carRepository = new CarRepository(initCars(carModelRepository, carBrandRepository));

        CarService carService = new CarService(carRepository);
        CarBrandService carBrandService = new CarBrandService(carBrandRepository);
        CarModelService carModelService = new CarModelService(carModelRepository);


        ListBrand("Skoda", carService, carBrandService);
        ListBrand("Chevrolet", carService, carBrandService);

        System.out.println("List of cars of model \"Fabia\" and older than 4 years");
        printList(carService.filterOlder(carService.getCarsByModels(carModelService.getCarModelsByName
                ("Fabia")), 4));
        System.out.println();

        System.out.println("List of cars of year 2014 with price more than 440000");
        printList(carService.filterPriceMore(carService.filterByYear
                (carService.getCars(), 2014), 440000));


    }

    private static void printList(List list) {
        if (list == null) {
            System.out.println("List is empty");
        } else {
            for (Object o : list) {
                System.out.println(o);
            }
        }
    }

    private static void ListBrand(String brand, CarService carService, CarBrandService carBrandService) {
        System.out.println("List of cars of brand " + brand);
        printList(carService.getCarsByBrand(carBrandService.getCarBrandByName(brand)));
        System.out.println();
    }

    private static List<Car> initCars(CarModelRepository carModelRepository, CarBrandRepository carBrandRepository) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1L, carBrandRepository.getCarBrandById(1L), carModelRepository.getCarModelById(1L),
                2015, "Black", 500000, "AA 2588 KX"));
        cars.add(new Car(2L, carBrandRepository.getCarBrandById(1L), carModelRepository.getCarModelById(1L),
                2014, "Red", 450000, "AA 2588 KX"));
        cars.add(new Car(3L, carBrandRepository.getCarBrandById(1L), carModelRepository.getCarModelById(2L),
                2015, "White", 600000, "AA 2588 KX"));
        cars.add(new Car(4L, carBrandRepository.getCarBrandById(1L), carModelRepository.getCarModelById(2L),
                2011, "White", 300000, "AA 2588 KX"));
        cars.add(new Car(5L, carBrandRepository.getCarBrandById(1L), carModelRepository.getCarModelById(3L),
                2014, "Black", 1200000, "AA 2588 KX"));
        cars.add(new Car(6L, carBrandRepository.getCarBrandById(1L), carModelRepository.getCarModelById(7L),
                2014, "Red", 430000, "AA 2588 KX"));
        cars.add(new Car(7L, carBrandRepository.getCarBrandById(1L), carModelRepository.getCarModelById(7L),
                2013, "White", 520000, "AA 2588 KX"));
        cars.add(new Car(8L, carBrandRepository.getCarBrandById(1L), carModelRepository.getCarModelById(8L),
                2015, "Red", 500000, "AA 2588 KX"));
        cars.add(new Car(9L, carBrandRepository.getCarBrandById(2L), carModelRepository.getCarModelById(12L),
                2013, "Black", 290000, "AA 2588 KX"));
        cars.add(new Car(10L, carBrandRepository.getCarBrandById(2L), carModelRepository.getCarModelById(12L),
                2017, "Blue", 4900000, "AA 2588 KX"));
        cars.add(new Car(11L, carBrandRepository.getCarBrandById(2L), carModelRepository.getCarModelById(12L),
                2015, "Red", 5600000, "AA 2588 KX"));
        cars.add(new Car(12L, carBrandRepository.getCarBrandById(2L), carModelRepository.getCarModelById(13L),
                2015, "Yellow", 500000, "AA 2588 KX"));
        cars.add(new Car(13L, carBrandRepository.getCarBrandById(2L), carModelRepository.getCarModelById(14L),
                2015, "Black", 500000, "AA 2588 KX"));
        cars.add(new Car(14L, carBrandRepository.getCarBrandById(2L), carModelRepository.getCarModelById(45L),
                2015, "Black", 500000, "AA 2588 KX"));
        cars.add(new Car(15L, carBrandRepository.getCarBrandById(2L), carModelRepository.getCarModelById(45L),
                2015, "Black", 500000, "AA 2588 KX"));
        cars.add(new Car(16L, carBrandRepository.getCarBrandById(2L), carModelRepository.getCarModelById(46L),
                2015, "Black", 500000, "AA 2588 KX"));
        cars.add(new Car(17L, carBrandRepository.getCarBrandById(2L), carModelRepository.getCarModelById(23L),
                2015, "Black", 500000, "AA 2588 KX"));
        cars.add(new Car(18L, carBrandRepository.getCarBrandById(2L), carModelRepository.getCarModelById(67L),
                2014, "Black", 500000, "AA 2588 KX"));


        return cars;
    }

    private static List<CarBrand> initCarBrands(CarModelRepository carModelRepository) {
        List<CarBrand> carBrands = new ArrayList<>();
        carBrands.add(new CarBrand(1L, "Skoda", carModelRepository.getCarModelsByBrandName("Skoda")));
        carBrands.add(new CarBrand(2L, "Chevrolet", carModelRepository.getCarModelsByBrandName("Chevrolet")));
        return carBrands;
    }

    private static List<CarModel> initCarModels() {
        List<CarModel> carModels = new ArrayList<>();
        carModels.add(new CarModel(1L, "Fabia", "Skoda"));
        carModels.add(new CarModel(2L, "Fabia", "Skoda", 2));
        carModels.add(new CarModel(3L, "Fabia", "Skoda", 3));
        carModels.add(new CarModel(7L, "Octavia", "Skoda"));
        carModels.add(new CarModel(8L, "Octavia", "Skoda", 2));
        carModels.add(new CarModel(12L, "Aveo", "Chevrolet"));
        carModels.add(new CarModel(13L, "Aveo", "Chevrolet", 2));
        carModels.add(new CarModel(14L, "Aveo", "Chevrolet", 3));
        carModels.add(new CarModel(45L, "Cruze", "Chevrolet"));
        carModels.add(new CarModel(46L, "Cruze", "Chevrolet", 2));
        carModels.add(new CarModel(23L, "Camaro", "Chevrolet"));
        carModels.add(new CarModel(67L, "Volt", "Chevrolet"));
        return carModels;
    }
}
