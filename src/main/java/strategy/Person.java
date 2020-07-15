package strategy;

public class Person {

    int age;

    public Person(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}
