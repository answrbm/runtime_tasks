package lesson15.classwork;

public class BoxAnyType {

    private int key;
    private Object value;

    public BoxAnyType(int key, Object value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }
}
