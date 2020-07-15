package singleton;

/**
 *  单例模式 ： 懒汉式
 *  在方法被调用的时候才会完成实例化
 *  需要使用 D(double)-C(check)-L(lock) 保证线程安全
 *  缺点：加锁之后，性能降低
 */
public class SingletonObject_2 {

    private static SingletonObject_2 object;

    private SingletonObject_2() {
    }

    public static SingletonObject_2 getInstance(){
        if (object == null) {
            synchronized (SingletonObject_2.class) {
                if (object == null) {
                    object = new SingletonObject_2();
                }
            }
        }
        return object;
    }


    public static void main(String[] args) {
        System.out.println(SingletonObject_2.getInstance());
        System.out.println(SingletonObject_2.getInstance());
        System.out.println(SingletonObject_2.getInstance());
    }
}
