package org.example;

import java.util.Objects;

public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        Cat some = (Cat) obj;
        return Objects.equals(this.name,some.name);



    }
}
