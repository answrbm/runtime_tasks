package lesson15.classwork;

public interface Boxable<T> {

    int getKey();
    T getValue();
    void setValue(T value);
}
