package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    String name;
    double dimensionsA;
    double dimensionsB;
    boolean postmark;

    public Stamp(String name, double dimensionsA, double dimensionsB, boolean postmark) {
        this.name = name;
        this.dimensionsA = dimensionsA;
        this.dimensionsB = dimensionsB;
        this.postmark = postmark;
    }

    public String getName() {
        return name;
    }

    public double getDimensionsA() {
        return dimensionsA;
    }

    public double getDimensionsB() {
        return dimensionsB;
    }

    public boolean isPostmark() {
        return postmark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.dimensionsA, dimensionsA) == 0 && Double.compare(stamp.dimensionsB, dimensionsB) == 0 && postmark == stamp.postmark && name.equals(stamp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dimensionsA, dimensionsB, postmark);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", dimensionsA=" + dimensionsA +
                ", dimensionsB=" + dimensionsB +
                ", postmark=" + postmark +
                '}';
    }
}

