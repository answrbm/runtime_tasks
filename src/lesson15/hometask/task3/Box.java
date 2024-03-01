package lesson15.hometask.task3;

public class Box<K,T extends Fruit> {
    K key;
    T value;

    public Box(K key, T value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Box{" +
                "key=" + key +
                "; keyType=" + key.getClass().getName() +
                ", obj=" + value +
                "; objType=" + value.getClass().getName() +
                '}';
    }
}
