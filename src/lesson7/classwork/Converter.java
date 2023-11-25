package lesson7.classwork;

public class Converter {

    public static Integer convert(Double d) {
        return d.intValue();
    }

    public static Integer convert(Float d) {
        return d.intValue();
    }

    public static Integer convert(Long d) {
        return d.intValue();
    }

    public static Float convert(Integer i) {
        return i.floatValue();
    }

    public static Double convert(Byte i) {
        return i.doubleValue();
    }

    public static Long convert(Short i) {
        return i.longValue();
    }
}
