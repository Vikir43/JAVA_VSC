package Homework3;

//Создать ArrayList<Integer> и добавить нулевым эллементом ноль 10000 раз.
//Повторить пятый пункт но с LinkedList.
import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        ArrayList<Integer> list = new ArrayList<>(1000);
        { for (int i = 0; i < 1000; i++) list.add(0);}
        System.out.println(list);
        long  end = System.currentTimeMillis();
        System.out.println(end - begin);

        begin = System.currentTimeMillis();
        LinkedList<Integer> list2 = new LinkedList<>();
        { for (int i = 0; i < 1000; i++) list2.add(0);}
        System.out.println(list2);
        end = System.currentTimeMillis();
        System.out.println(end - begin);
    }
}
