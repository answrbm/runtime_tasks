package lesson7.classwork;

public class Converter {

    public static Integer convert(Double d) {
        return Integer.parseInt(String.valueOf(d));
    }

    public static Integer convert(Float d) {
        return Integer.parseInt(String.valueOf(d));
    }

    public static Integer convert(Long d) {
        return Integer.parseInt(String.valueOf(d));
    }

    public static Float convert(Integer i) {
        return Float.parseFloat(String.valueOf(i));
    }

    public static Double convert(Byte i) {
        return Double.parseDouble(String.valueOf(i));
    }

    public static Long convert(Short i) {
        return Long.parseLong(String.valueOf(i));
    }
}
