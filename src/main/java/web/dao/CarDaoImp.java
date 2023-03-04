package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao{
    @Override
    public List<Car> getCarList(int count) {

        List<Car> carList = new ArrayList<>();

        carList.add(new Car("Model1", 1,10));
        carList.add(new Car("Model2", 2,20));
        carList.add(new Car("Model3", 3,30));
        carList.add(new Car("Model4", 4,40));
        carList.add(new Car("Model5", 5,50));

        return count >= 5 ? carList : carList.subList(0,count);
    }
}
