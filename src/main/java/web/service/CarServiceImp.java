package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {

    private List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("It", "pink", 1));
        carList.add(new Car("Bilibaben", "white", 54));
        carList.add(new Car("Plotva", "brown", 34));
        carList.add(new Car("Canis Bodhi", "red", 715));
        carList.add(new Car("Pontiac Firebird", "black", 82));
    }

    @Override
    public List<Car> listCars(int count) {
        if (count <=4 && count >= 1) {
            return carList.stream().limit(count).collect(Collectors.toList());
        } else return carList;
    }

    public List<Car> getAllCars() {
        return carList;
    }
}
