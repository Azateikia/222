package web.service;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import web.model.Car;

import java.util.List;

public interface CarService {
    public List<Car> cars();

}
