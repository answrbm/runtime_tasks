package lesson7.classwork;

public class MathUtils {

    private static int counter = 0;

    public Integer sum(Integer x, Integer y) {
        counter++;
        return x + y;
    }

    public Integer sub(Integer x, Integer y) {
        counter++;
        return x - y;
    }

    public Integer mult(Integer x, Integer y) {
        counter++;
        return x * y;
    }

    public Integer div(Integer x, Integer y) {
        counter++;
        return x / y;
    }
}
