package strategy;

/**
 * 策略模式： 比较器接口
 * o1 与 o2 比较策略抽象
 */
public interface Comparator<T> {

    int compare(T o1, T o2);


}
