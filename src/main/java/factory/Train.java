package factory;

import factory.Moveable;

public class Train implements Moveable {
    @Override
    public void go() {
        System.out.println("train...wu.wu.wu...");
    }
}
