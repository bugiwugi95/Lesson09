package lesson9;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Task9_5 {
    public static void main(String[] args) throws IOException {
       /*
        7.Пользователь вводит 10 строк.
        Те из них, в которых есть восклицательный знак, выведите в stderr.
        Попробуйте использовать цикл
        */
        Scanner sc = new Scanner(System.in);
        String str = "";
        int strCurrent = 1;
        while (strCurrent <= 10) {
            str = sc.nextLine();
            strCurrent++;
            if (!str.contains("!")) {
                System.out.println(strCurrent + " " + str);

            } else {
                System.err.println(strCurrent + " " + str);
            }

        }


//        String str2 = sc.nextLine();
//        String str3 = sc.nextLine();
//        String str4 = sc.nextLine();
//        String str5 = sc.nextLine();
//        String str6 = sc.nextLine();
//        String str7 = sc.nextLine();
//        String str8 = sc.nextLine();
//        String str9 = sc.nextLine();
//        String str10 = sc.nextLine();
//        if (str.equals("!") || str2.equals("!") || str3.equals("!") || str4.equals("!") ||
//                str5.equals("!") || str6.equals("!") || str7.equals("!") || str8.equals("!") || str9.equals("!") || str10.equals("!")) {
//            System.err.println(str);
//
//        }else {
//            System.out.println(str);
//        }

    }
}
