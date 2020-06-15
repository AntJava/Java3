package Lesson1;
//        1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
//        2. Написать метод, который преобразует массив в ArrayList;
//        3. Большая задача:
//        a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
//        b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
//        c. Для хранения фруктов внутри коробки можете использовать ArrayList;
//        d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
//        e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той, которую подадут в compare в качестве параметра, true - если их веса равны, false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
//        f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку(помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами), соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;
//        g. Не забываем про метод добавления фрукта в коробку.

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static <T> T[] swapArr(T[]array, int n1, int n2){
        T[] arr = Arrays.copyOf(array, array.length);
        T sw = arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=sw;
        return arr;
    }

    public static <T> ArrayList<T> arrAsList(T[]arr){
        return new ArrayList<>(Arrays.asList(arr));
    }

    public static void main(String[] args) {

        Integer arr1[] = {1, 2, 3, 4, 5};
        String arr2[] = {"a", "b", "c", "d", "e"};
        System.out.println("Result of swapping arr1: " + Arrays.toString(swapArr(arr1, 0, arr1.length - 1)));
        System.out.println("Result of swapping arr2: " + Arrays.toString(swapArr(arr2, 0, arr2.length - 1)));

        System.out.println("arr1 as List: " + arrAsList(arr1));
        System.out.println("arr2 as List: " + arrAsList(arr2));

        Box<Orange> box1 = new Box<>();
        Box<Orange> box2 = new Box<>();
        Box<Apple> box3 = new Box<>();
        Box<Apple> box4 = new Box<>();
        box1.addFruit(new Orange(),30);
        box2.addFruit(new Orange(),20);
        box3.addFruit(new Apple(),25);
        box4.addFruit(new Apple(),30);

        System.out.println("Box 1 weight: "+box1.getWeight());
        System.out.println("Box 2 weight: "+box2.getWeight());
        System.out.println("Box 3 weight: "+box3.getWeight());
        System.out.println("Box 4 weight: "+box4.getWeight());

        System.out.println("Box 1 equals box 3: " + box1.compare(box3));
        System.out.println("Box 2 compare box 4: " + box2.compare(box4));

        box1.toOtherBox(box2);
        box3.toOtherBox(box4);

        System.out.println("Box 1 new weight: "+box1.getWeight());
        System.out.println("Box 2 new weight: "+box2.getWeight());
        System.out.println("Box 3 new weight: "+box3.getWeight());
        System.out.println("Box 4 new weight: "+box4.getWeight());
    }
}
