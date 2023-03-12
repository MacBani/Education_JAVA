
/* Первый семинар.
1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
Пункты реализовать в методе main
*Пункты реализовать в разных методах
int i = new Random().nextInt(k); //это кидалка случайных чисел!) */
import java.util.Random;

public class sem1 {
    public static void main(String[] args) {
        int i = new Random().nextInt(0, 2000); // пункт 1
        System.out.println(i);

        int n = Integer.toBinaryString(i).length() - 1; // пункт 2
        System.out.println(n);

        int[] m1 = new int[Short.MAX_VALUE]; // пункт 3
        int count = 0;
        for (int j = i; j < m1.length; j++) {
            if (n % j == 0) {
                m1[count] = j;
                count++;
            }
        }

        int[] m2 = new int[Short.MIN_VALUE]; // пункт 4
        count = 0;
        for (int g = m2.length; g < i; g++) {
            if (n % g == 0) {
                m2[count] = g;
                count++;
            }
        }
    }
}
