import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Random;

/*
1. Реализовать алгоритм сортировки списков компаратором.
2. Пусть дан произвольный список целых чисел, удалить из него чётные числа
3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
4. Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом.
5. Создать ArrayList<Integer> и добавить нулевым эллементом ноль 10000 раз.
6. Повторить пятый пункт но с LinkedList.
7. Сравнить время работы пятого и шестого пунктов.*/

public class sem3 {
    public static void main(String[] args) {
        ArrayList<Integer> s1 = new ArrayList<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(7);
        s1.add(5);
        s1.add(3);
        s1.add(4);
        System.out.print("Исходный список: ");
        s1.forEach(n -> System.out.print(n + " "));
        System.out.println();

        // №1
        s1.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer t0, Integer t1) {
                return t0 - t1;
            }
        });
        s1.forEach(n -> System.out.print(n + " "));
        System.out.println();

        // №2
        s1.removeIf(n -> (n % 2 == 0));
        System.out.println(s1);

        // №3
        System.out.println("Минимальное число: " + s1.get(0) + " Среднее число: " + s1.get((s1.size() - 1) / 2)
                + " Максимальное число: " + s1.get(s1.size() - 1));

        // №4
        ArrayList<Integer> s2 = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            s2.add(new Random().nextInt(10));
        }
        System.out.println(s1);
        System.out.println(s2);
        s1.removeAll(s2);
        System.out.println(s1);

        // №5-7
        ArrayList<Integer> s3 = new ArrayList<>();
        s3.add(0);
        long begin = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            s3.set(0, 0);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - begin);

        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(0);
        long begin1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            l1.set(0, 0);
        }
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - begin1);
    }
}
