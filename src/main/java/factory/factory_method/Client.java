package factory.factory_method;

import factory.Moveable;

public class Client {


    public static void main(String[] args) {
        VehicleFactory factory = new CarFactory();
        Moveable moveable = factory.create();
        moveable.go();
    }
}
