import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class sem4_1 {
    static LinkedList<ArrayList<String>> array1 = new LinkedList<>();
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        addData();
        printData();

        Comparator<ArrayList<String>> sortArrayAge = new Comparator<ArrayList<String>>() {
            @Override
            public int compare(ArrayList<String> t1, ArrayList<String> t2) {
                if (Integer.parseInt(t1.get(3)) > Integer.parseInt(t2.get(3)))
                    return 1;
                else if (Integer.parseInt(t1.get(3)) < Integer.parseInt(t2.get(3)))
                    return -1;
                else
                    return 0;
            }
        };
        System.out.println("Сортировка по возрасту");
        array1.sort(sortArrayAge);
        printData();

        Comparator<ArrayList<String>> sortArraySex = new Comparator<ArrayList<String>>() {
            @Override
            public int compare(ArrayList<String> t1, ArrayList<String> t2) {
                if (t1.get(4).charAt(0) > t2.get(3).charAt(0))
                    return 1;
                else if (t1.get(4).charAt(0) < t2.get(3).charAt(0))
                    return -1;
                else
                    return 0;
            }
        };
        System.out.println("Сортировка по полу");
        array1.sort(sortArraySex);
        printData();

        Comparator<ArrayList<String>> sortArrayAgeSex = new Comparator<ArrayList<String>>() {
            @Override
            public int compare(ArrayList<String> t1, ArrayList<String> t2) {
                if (t1.get(4).charAt(0) == (t2.get(3).charAt(0))) {
                    if (Integer.parseInt(t1.get(3)) > Integer.parseInt(t2.get(3)))
                        return 1;
                    else if (Integer.parseInt(t1.get(3)) < Integer.parseInt(t2.get(3)))
                        return -1;
                    else
                        return 0;
                } else {
                    if (t1.get(4).charAt(0) > t2.get(3).charAt(0))
                        return 1;
                    else if (t1.get(4).charAt(0) < t2.get(3).charAt(0))
                        return -1;
                    else
                        return 0;
                }
            }

        };
        System.out.println("Сортировка по возрасту и полу");
        array1.sort(sortArrayAgeSex);
        printData();

    }

    public static void printData() {
        for (ArrayList<String> a : array1) {
            System.out.print(a.get(0) + " ");
            System.out.print(a.get(1).toUpperCase().charAt(0) + ".");
            System.out.print(a.get(2).toUpperCase().charAt(0) + ". ");
            System.out.print(a.get(3) + " ");
            System.out.println(a.get(4));
        }
    }

    public static void addData() {
        String command;
        System.out.println("Введите '1' для ввода новой записи\nВведите '2' для завершения ввода данных");
        command = in.nextLine();
        while (command.equals("1")) {
            array1.add(getData());
            System.out.println("Введите '1' для ввода новой записи\nВведите '2' для завершения ввода данных");
            command = in.nextLine();
        }
    }

    public static ArrayList<String> getData() {
        ArrayList<String> array2 = new ArrayList<>();

        System.out.println("Введите фамилию: ");
        String f = in.nextLine();
        System.out.println("Введите имя: ");
        String i = in.nextLine();
        System.out.println("Введите отчество: ");
        String o = in.nextLine();
        System.out.println("Введите возраст: ");
        String age = in.nextLine();
        System.out.println("Введите пол: ");
        String sex = in.nextLine();
        array2.add(f);
        array2.add(i);
        array2.add(o);
        array2.add(age);
        array2.add(sex);

        return array2;
    }

    static void sortArrayList() {

    }

}
