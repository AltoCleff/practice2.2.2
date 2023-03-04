package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImp;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService{

    private final CarDao carDao = new CarDaoImp();
    @Override
    public List<Car> getCarList(int count) {
        return carDao.getCarList(count);
    }
}
