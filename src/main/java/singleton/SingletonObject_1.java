package singleton;

/**
 *  单例模式 ： 饿汉式
 *  利用JVM类加载机制进行单例对象创建，JVM保证线程安全
 *  简单实用，推荐使用
 *  唯一缺点：不管用到与否，类加载时就完成了实例化
 */
public class SingletonObject_1 {

    private static final SingletonObject_1 object = new SingletonObject_1();

    private SingletonObject_1() {
    }

    public static SingletonObject_1 getInstance(){
        return object;
    }


    public static void main(String[] args) {
        System.out.println(SingletonObject_1.getInstance());
        System.out.println(SingletonObject_1.getInstance());
        System.out.println(SingletonObject_1.getInstance());
    }
}
