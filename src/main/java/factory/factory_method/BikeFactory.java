package factory.factory_method;

import factory.Bike;
import factory.Car;
import factory.Moveable;

public class BikeFactory implements VehicleFactory{
    @Override
    public Moveable create() {
        return new Bike();
    }
}
