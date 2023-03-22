import java.util.ArrayList;
import java.util.Comparator;
/*
1. Ввод с консоли в формате Ф.И.О Возраст пол
2. Выход из режима ввода по горячей кнопке
3. Вывод несортированного списка в формате Иванов И.И. 32M
4. Два варианта продолжения, либо вывод списка сортированного по возрасту и полу либо завершение приложения.
Реализовать сортировку, по возможности, с использованием дополнительного индексного списка. */
import java.util.Scanner;

public class sem4 {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> array1 = new ArrayList<>();
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

            if (end.equals("k")) {
                flag = false;
            }
            System.out.println(array1);
        }
        ArrayList<ArrayList<String>> array3 = new ArrayList<>();
        ArrayList<ArrayList<String>> array4 = new ArrayList<>();
        while (!flag) {
            System.out.println(
                    "Для сортировки по полу введите A, для сортировки по возрасту введите B, для остановки программы ыыедите Z ");
            String sortirovka = in.nextLine();
            if (sortirovka.equals("a")) {

            } else if (sortirovka.equals("b")) {

            } else {
                flag = true;
            }
        }
        in.close();

    }
}
