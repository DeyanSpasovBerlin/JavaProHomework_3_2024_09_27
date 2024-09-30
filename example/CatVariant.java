package org.example;

import java.util.Objects;

public class CatVariant {
    private String name;
    private int age;

    public CatVariant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
                if (this == obj) {
            return true;
        }
        if (obj instanceof String) {
            return this.name.equals(obj);
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CatVariant other = (CatVariant) obj;
        return this.name.equals(other.name);
    }
}
