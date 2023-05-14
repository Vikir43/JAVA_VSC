package Homework3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
//Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом.
public class Task4 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(21);
        list1.add(25);
        list1.add(18);
        list1.add(44);

        System.out.println("Список 1: " + list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(21);
        list2.add(22);
        list2.add(33);
        list2.add(44);

        System.out.println("Список 2: " + list2);

        Set<Integer> unionSet = new HashSet<>();
        unionSet.addAll(list1);
        unionSet.addAll(list2);
        System.out.println("Объедененный список: " + unionSet);
    }
}
