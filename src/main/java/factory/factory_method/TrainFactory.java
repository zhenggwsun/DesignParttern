package factory.factory_method;

import factory.Bike;
import factory.Moveable;
import factory.Train;

public class TrainFactory implements VehicleFactory{
    @Override
    public Moveable create() {
        return new Train();
    }
}
