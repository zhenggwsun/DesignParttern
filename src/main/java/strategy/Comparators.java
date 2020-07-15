package strategy;

/**
 *  比较器 集合
 *  策略模式 lambda 表达式
 */
public class  Comparators {

    /**
     *  person age 比较策略
     */
    public static Comparator<Person> COMPARATOR_PERSON_AGE = (o1,o2)->{
        return o1.age - o2.age;
    };

    /**
     *  tree height 比较策略
     */
    public static Comparator<Tree> COMPARATOR_TREE_HEIGHT = (o1, o2) -> {
        return o1.height - o2.height;
    };
}
