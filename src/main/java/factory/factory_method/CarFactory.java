package factory.factory_method;

import factory.Car;
import factory.Moveable;

public class CarFactory implements VehicleFactory{
    @Override
    public Moveable create() {
        return new Car();
    }
}
