package org.example;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vasya", 1);
        Cat cat2 = new Cat("Vasya", 1);
        Box box1 = new Box(cat1);
        Box box2 = new Box(cat2);

        CatVariant cat1Variant = new CatVariant("Vasya", 1);
        CatVariant cat2Variant = new CatVariant("Vasya", 1);
        BoxVariant box1Variant = new BoxVariant(cat1Variant);
        BoxVariant box2Variant = new BoxVariant(cat2Variant);

        System.out.println("box1 = box2 ? "+box1.equals(box2));
        System.out.println("cat1 = cat2 ? "+cat1.equals(cat2));

        System.out.println("box1Variant = box2Variant ? "+box2Variant.equals(box2Variant));
        System.out.println("cat1Variant = cat2Variant ? "+cat1Variant.equals(cat2Variant));

    }
}