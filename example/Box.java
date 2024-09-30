package org.example;

import java.util.Objects;

public class Box {
    Cat cat;


    public Box(Cat cat) {
        this.cat = cat;
    }

    @Override
    public boolean equals(Object obj) {

                Box other = (Box) obj;
        return Objects.equals(this.cat, other.cat);
    }
}
