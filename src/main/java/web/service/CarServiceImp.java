package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarsDAO;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private final CarsDAO carsDAO;

    @Autowired
    public CarServiceImp(CarsDAO carsDAO) {
        this.carsDAO = carsDAO;
    }

    @Override
    public List<Car> getCars() {
        return carsDAO.getCars();
    }

    @Override
    public List<Car> getCars(int count) {
        return carsDAO.getCars(count);
    }
}
