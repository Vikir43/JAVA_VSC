package Homework3;

import java.util.ArrayList;
import java.util.Collections;
//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(21);
        list.add(25);
        list.add(18);
        list.add(44);
        list.add(13);

        System.out.println("Список: " + list);

        int min = Collections.min(list);
        int max = Collections.max(list);
        double average = list.stream().mapToInt(Integer::intValue).average().orElse(0);

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + average);

    }
}