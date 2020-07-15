package factory.factory_method;

import factory.Moveable;

/**
 *  工厂方法模式：工厂抽象接口
 *
 *  交通工具工厂接口
 */
public interface VehicleFactory {

    Moveable create();
}
