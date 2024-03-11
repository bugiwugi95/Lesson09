package lesson9;

import java.io.IOException;
import java.util.Scanner;

public class Task9_6 {
    public static void main(String[] args) throws IOException {
      /*
      8.Пользователь вводит 10 строк, потом число max.
      Вывести в stdout те строки, длинна которых меньше max, а в stderr те, длинна которых больше, обрезав по max
       */
        Scanner sc = new Scanner(System.in);
        String str = "";
        int strCurrent = 1;
        while (strCurrent <= 10) {
            str = sc.nextLine();
            strCurrent++;
            System.out.println(str);
        }
        System.out.println("max");
        int max = sc.nextInt();
        if (max > str.length()) {
            System.out.println("max > " + str);
        } else {
            System.err.println("max < " + str);
        }

    }
}
