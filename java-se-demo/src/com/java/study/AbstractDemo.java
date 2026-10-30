package com.java.study;

public class AbstractDemo {
    public static void main(String[] args) {
        Person person = new Student();
        person.eat();

        Student s = new Student();
        s.eat();

//        Person p = new Person(); // Person是抽象的; 无法实例化

    }
}

abstract class Person {
    public abstract void eat();
}

class Student extends Person {
    @Override
    public void eat() {
        System.out.println("Student eat");
    }
}
