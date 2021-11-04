package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarsDAO {

    private static int COUNTER;
    private final List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car(++COUNTER, "BMW", "M2", 2015));
        carList.add(new Car(++COUNTER, "Tesla", "Model 3", 2017));
        carList.add(new Car(++COUNTER, "Nissan","Skyline", 1957));
        carList.add(new Car(++COUNTER, "Honda", "Integra", 1985));
        carList.add(new Car(++COUNTER, "Porsche", "Boxster", 1996));
    }

    public List<Car> getCars() {
        return carList;
    }

    public List<Car> getCars(int count) {
        return carList.stream().limit(count).toList();
    }

}
