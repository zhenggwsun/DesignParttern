package singleton;

/**
 *  单例模式 ： 枚举类
 *  利用JVM类加载机制进行单例对象创建，JVM保证线程安全
 *  语法上完美，也解决了反序列化的问题。因为enum没有构造方法
 *  但不推荐使用，因为单例对象为什么要使用enum呢，不符合面向对象思想，知道就行
 */
public enum  SingletonObject_4 {
    INSTANCE
    ;
    static {
        System.out.println("外部类加载了");
    }
}
