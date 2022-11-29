package web.service;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {


    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car( "Toyota", "Supra", 3.5));
        cars.add(new Car( "Mazda", "RX7", 1.3));
        cars.add(new Car( "Nissan", "R34", 2.5));
        cars.add(new Car( "Subaru", "WRX", 2.5));
        cars.add(new Car( "Lada", "Super_Tuning_Turbo_RS_RX_NoBrains", 5.5));

    }


    @Override
    public List<Car> cars() {
        return cars;
    }

}
