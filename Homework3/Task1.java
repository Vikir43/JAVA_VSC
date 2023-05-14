package Homework3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//Реализовать алгоритм обратной сортировки списков компаратором.
public class Task1 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 4, 2, 6, 5, 8);
        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list);
    }
}