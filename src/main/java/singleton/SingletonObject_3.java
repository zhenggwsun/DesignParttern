package singleton;

/**
 *  单例模式 ： 静态内部类
 *  利用JVM类加载机制进行单例对象创建，JVM保证线程安全
 *  解决了饿汉式加载的不使用也会加载的问题
 *  技术点：Jvm在进行外部类加载时不会加载内部类
 *  推荐使用
 */
public class SingletonObject_3 {


    static {
        System.out.println("外部类加载了");
    }

    private SingletonObject_3() {
        System.out.println("对象创建了");
    }


    public static SingletonObject_3 getInstance(){
        return ObjectHolder.INSTANCE;
    }

    private static class ObjectHolder{
        static {
            System.out.println("静态内部类加载了");
        }
        private static final SingletonObject_3 INSTANCE = new SingletonObject_3();
    }

    public static void main(String[] args) {
        System.out.println(SingletonObject_3.getInstance());
        System.out.println(SingletonObject_3.getInstance());
        System.out.println(SingletonObject_3.getInstance());
    }
}
