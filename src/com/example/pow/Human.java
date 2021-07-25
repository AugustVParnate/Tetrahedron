package com.epam.jwd.model;

public class Human {

    private int age;
    private int height;
    private int weight;
    private String name;
    private Sex sex;

    public Human(int age, int height, int weight, String name, Sex sex) {
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.name = name;
        this.sex = sex;
    }

    public void growOlder() {
        age++;
    }

    public void makeChild(Human partner) {
        if (this.sex == partner.sex) {
            throw new IllegalArgumentException("Can not create child for two humans with same sex");
        }
        System.out.println("Child has been created for " + this.name + " and " + partner.name + ".");
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public Sex getSex() {
        return sex;
    }
}

