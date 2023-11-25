package lesson7.classwork;

public class ImmutablePoint {

    private final Double x;
    private final Double y;

    public ImmutablePoint(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }
}
