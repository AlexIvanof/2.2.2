package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    private static final List<Car> carList=  List.of(
            new Car("Reno",2011,1 ),
            new Car("Volve",2012,2 ),
            new Car("Chevrole",2013,3 ),
            new Car("Lada",2015,4 ),
            new Car("Niva",1999,5 )
    );

@Override
public List<Car> getCars(int count){
    if (count>0&& count<5){
        return carList.stream().limit(count).toList();
    } else {
        return carList;
    }
}
}