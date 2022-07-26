package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.List;


@Repository
public class CarDaoImpl implements CarDao{
    private List<Car> cars = List.of(new Car("Model1", 1, 2015),
            new Car("Model2", 2, 2016),
            new Car("Model3", 3, 2017),
            new Car("Model4", 4, 2018),
            new Car("Model5", 5, 2019));

    @Override
    public List<Car> getCars() {
        return cars;
    }

}
