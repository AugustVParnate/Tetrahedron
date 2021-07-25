package com.epam.jwd.app;

public class Main {

    public static void main(String[] args) {
//        int now = pow(3, 4);
//        System.out.print(now);
        Human schoolboy = new Human(12, 170, 70, "petya", Sex.MALE);
        Human strangeGirl = new Human(13, 189, 77, "Anasteisha", Sex.FEMALE);
        schoolboy.makeChild(strangeGirl);
        schoolboy.growOlder();
        System.out.println(schoolboy.getAge());
    }

    private static int pow(int base, int power) {
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= base;
        }
        return result;
    }
}
