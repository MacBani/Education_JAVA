import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
/*
1. Ввод с консоли в формате Ф.И.О Возраст пол
2. Выход из режима ввода по горячей кнопке
3. Вывод несортированного списка в формате Иванов И.И. 32M
4. Два варианта продолжения, либо вывод списка сортированного по возрасту и полу либо завершение приложения.
Реализовать сортировку, по возможности, с использованием дополнительного индексного списка.
 */

public class sem4 {
    public static void main(String[] args) {
        LinkedList<ArrayList<String>> array1 = new LinkedList<>();
        ArrayList<String> array2 = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        boolean flag = true;

        while (flag) {

            System.out.println("Введите ваше ФИО: ");
            String fio = in.nextLine();

            System.out.println("Введите ваш возраст: ");
            String age = in.nextLine();

            System.out.println("Введите ваш пол: ");
            String sex = in.nextLine();
            System.out.println(
                    "Нажмите K для выхода из режима ввода информации, дла продолжения ввода - любую другую клавишу");
            String end = in.nextLine();
            array2.add(fio);
            array2.add(age);
            array2.add(sex);
            array1.add(array2);
            array2.clear();
            if (end.equals("k")) {
                flag = false;
            }
        }
        System.out.println(array1);

        ArrayList<ArrayList<String>> array3 = new ArrayList<>();
        ArrayList<ArrayList<String>> array4 = new ArrayList<>();
        while (!flag) {
            System.out.println(
                    "Для сортировки по полу введите B, для сортировки по возрасту введите A, для остановки программы введите Z ");
            String sortirovka = in.nextLine();
            if (sortirovka.equals("A")) {
                for (int i = 1; i < array1.size(); i++) {
                    for (int j = 0; j < array1.size(); j++) {
                        int delta = Integer.parseInt(array1.get(i).get(2)) - Integer.parseInt(array1.get(i - 1).get(2));
                        if (delta < 0) {
                            array3.set(0, array1.get(i - 1));
                            array4.set(0, array1.get(i));
                            array1.set(i - 1, array4.get(0));
                            array1.set(i, array3.get(0));
                        }
                    }
                }
                System.out.println(array1);
            } else if (sortirovka.equals("B")) {

            } else {
                flag = true;
            }
        }
        in.close();

    }
}
