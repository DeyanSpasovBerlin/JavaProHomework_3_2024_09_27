package org.example;

import java.util.Objects;

public class BoxVariant {
    CatVariant cat;

    public BoxVariant(CatVariant cat) {
        this.cat = cat;
    }

    @Override
    public boolean equals(Object obj) {
                if (this == obj) {
        return true;
    }
        if (obj instanceof String) {
        return this.cat.equals(obj);
    }
        if (obj == null || getClass() != obj.getClass()) {
        return false;
    }
        BoxVariant other = (BoxVariant) obj;
        return this.cat.equals(other.cat);
    }
}
