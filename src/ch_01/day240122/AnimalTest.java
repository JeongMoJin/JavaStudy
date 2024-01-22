package ch_01.day240122;

abstract class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }
    public String getName() {return name;}

    public abstract void bark();
    public abstract String toString();

    public void introduce() {
        System.out.println(toString() + "입니다.");
        bark();
    }
}

class Cat extends Animal {
    private int age;

    public Cat(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public void bark() {
        System.out.println("야옹 야옹");
    }

    @Override
    public String toString() {
        return age + "살 " + getName();
    }
}

class Dog extends Animal {
    private String type;

    public Dog(String name, String type) {
        super(name);
        this.type = type;
    }

    @Override
    public void bark() {
        System.out.println("멍멍!");
    }

    @Override
    public String toString() {
        return type + "인 " + getName();
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("바둑이", "삽살개"),
                new Cat("아롱이",7),
                new Dog("백두", "진돗개"),
        };
        for (Animal animal : animals) {
            animal.introduce();
            System.out.println();
        }
    }
}
