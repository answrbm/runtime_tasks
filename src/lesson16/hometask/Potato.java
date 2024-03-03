package lesson16.hometask;

import java.util.Objects;

public class Potato implements Comparable<Potato> {

    public final int id;

    /**
     * Масса
     */
    public final int weight;

    /**
     * Длина
     */
    public final int length;

    /**
     * Ширина
     */
    public final int girth;

    public Potato(int id, int weight, int length, int girth) {
        this.id = id;
        this.weight = weight;
        this.length = length;
        this.girth = girth;
    }

    public double getAlpha() {
        double weightAlpha = calcPercent(weight,50);
        double lengthAlpha = calcPercent(length,65);
        double girthAlpha = calcPercent(girth,80);
        return weightAlpha + lengthAlpha + girthAlpha;
    }

    private double calcPercent(int value, int percent) {
        return ( ((double) value) / 100 ) * percent;
    }

    @Override
    public int compareTo(Potato o) {
        // Сравните картофелины по альфа характеристике
        return (int) Math.round(getAlpha() - o.getAlpha());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Potato potato = (Potato) o;
        return id == potato.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Potato{" +
                "id=" + id +
                ", weight=" + weight +
                ", length=" + length +
                ", girth=" + girth +
                '}';
    }
}
