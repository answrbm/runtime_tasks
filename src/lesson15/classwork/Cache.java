package lesson15.classwork;

import java.util.*;

//Задание 4: Реализуйте обобщенный класс кэша, который может хранить элементы различных типов.
// Для каждого типа элементов должна быть возможность указать максимальное количество хранимых объектов.
// Если в кэше не хватает места для нового элемента, самый старый элемент того же типа должен быть удален.
// Используйте wildcards для реализации методов добавления и получения элементов из кэша.
public class Cache<T> {

    private final Map<Class<? extends T>, List<T>> elements;
    private final Map<Class<? extends T>, Integer> maxSize;

    public Cache() {
        this.elements = new HashMap<>();
        this.maxSize = new HashMap<>();
    }

    public void setMaxSize(Class<? extends T> classType, Integer maxCapacity) {
        maxSize.put(classType,maxCapacity);
    }

    public void addElement(Class<? extends T> classType, T elem) {
        elements.putIfAbsent(classType,new ArrayList<>());
        List<T> elementsList = elements.get(classType);

        Integer maxListCapacity = maxSize.get(classType);
        if(elementsList.size() >= maxListCapacity) {
            elementsList.remove(0);
        }
        elementsList.add(elem);
    }

    public List<T> getElements(Class<? extends T> classType) {
        return elements.get(classType);
    }


}
