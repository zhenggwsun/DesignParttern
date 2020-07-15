package factory.simple_factory;

import factory.Bike;
import factory.Car;
import factory.Train;

/**
 *  简易交通工具工厂
 *
 *  很简单，但是可扩展性不好
 *  每次新添加一种交通工具，就需要添加新的方法，不符合开闭原则
 */
public class SimpleVehicleFactory {


    public Car createCar(){
        return new Car();
    }

    public Bike createBike(){
        return new Bike();
    }

    public Train createTrain(){
        return new Train();
    }
}
