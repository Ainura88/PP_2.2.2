package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars = new ArrayList<>();

    @Override
    public List<Car> generateCars() {
        cars = new ArrayList<>();
        cars.add(new Car("Model1", 1, 2015));
        cars.add(new Car("Model2", 2, 2016));
        cars.add(new Car("Model3", 3, 2017));
        cars.add(new Car("Model4", 4, 2018));
        cars.add(new Car("Model5", 5, 2019));
        return cars;
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public List<Car> getCars(int amount) {
        return cars.stream().limit(amount).collect(Collectors.toList());
    }
}
