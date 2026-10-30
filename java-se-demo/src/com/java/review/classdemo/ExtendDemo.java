package com.java.review.classdemo;

public class ExtendDemo {
    public static void main(String[] args) {
        Person p = new Person("小明", 12);
        Student s = new Student("小红", 20, 99);
        Student student = new Student("小站", 35, 66);
        PrimaryStudent ps = new PrimaryStudent("小军", 9, 100, 5);
        System.out.println(ps.getScore()); // 100
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Student extends Person {
    private int score;

    public Student (String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

class PrimaryStudent extends Student {
    private int grade;

    public PrimaryStudent (String name, int age, int score, int grade) {
        super(name, age, score);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}