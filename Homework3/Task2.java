package Homework3;
import java.util.ArrayList;
//Пусть дан произвольный список целых чисел, удалить из него чётные числа
public class Task2 {
    public static void main(String[] args) {

     ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(21);
        numbers.add(25);
        numbers.add(18);
        numbers.add(44);
        numbers.add(13);

        System.out.println("Список: " + numbers);
        numbers.removeIf(n -> n % 2 == 0);

        System.out.println("Список без четных чисел: " + numbers);
    }
}

