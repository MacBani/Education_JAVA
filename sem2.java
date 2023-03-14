import java.util.ArrayList;

/* 
1. Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
2. Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
3*. Напишите программу, чтобы перевернуть строку с помощью рекурсии.
4. Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
5. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
6. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
7*. Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.
*/

public class sem2 {
    public static void main(String[] args) {
        String str = "Hello Moscow!";
        String str1 = "el";
        String str2 = "le";
        System.out.println(str.contains(str1)); // №1

        str2 = new StringBuilder(str2).reverse().toString();
        System.out.println(str1.equals(str2)); // №2

        int x = 3;
        int y = 56;
        StringBuilder builder = new StringBuilder();
        builder // №4
                .append(x)
                .append(" + ")
                .append(y)
                .append(" = ")
                .append(x + y)
                .append(" " + x)
                .append(" - ")
                .append(y)
                .append(" = ")
                .append(x - y)
                .append(" " + x)
                .append(" * ")
                .append(y)
                .append(" = ")
                .append(x * y);
        System.out.println(builder);

        /*
         * builder = builder.insert(7, "равно");
         * builder = builder.deleteCharAt(12);
         * 
         * builder = builder.insert(23, "равно");
         * builder = builder.deleteCharAt(28);
         * 
         * builder = builder.insert(40, "равно");
         * builder = builder.deleteCharAt(45);
         * 
         * System.out.println(builder);
         */

        builder = builder.replace(7, 8, "равно");
        builder = builder.replace(23, 24, "равно");
        builder = builder.replace(40, 41, "равно");
        System.out.println(builder);
    }

}
