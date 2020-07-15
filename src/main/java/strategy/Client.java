package strategy;

public class Client {


    public static void main(String[] args) {
        // 比较 3 个人谁的年龄大, 从大到小排列
        Person[] people = {
                new Person(13),
                new Person(22),
                new Person(18)
        };


        Person[] sort = Sorter.sort(people, Comparators.COMPARATOR_PERSON_AGE);
        print(sort);

        Tree[] trees = {
                new Tree(3),
                new Tree(5),
                new Tree(2),
        };

        Tree[] trees2 = Sorter.sort(trees, Comparators.COMPARATOR_TREE_HEIGHT);
        print(trees2);
    }


    public static <E> void print(E[] array){
        for (E e : array) {
            System.out.println(e);
        }
    }
}
