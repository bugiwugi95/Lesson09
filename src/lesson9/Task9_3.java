package lesson9;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Task9_3 {
    public static void main(String[] args) throws IOException {
        /*
        4.Используя Scanner на основе FileInputStream,
        прочесть из файла строку: название другого файла.
        Из этого другого файла прочесть название третьего файла,
        и в третий файл записать букву, которую пользователь введет через System.in (без сканера)
         */
        String file1 = "text.out";
        String file2 = "text.out1";
        String file3 = "text.out2";

        InputStream stream = Files.newInputStream(Paths.get(file1));
        Scanner sc = new Scanner(stream);
        String str = sc.nextLine();
        System.out.println(str);

        InputStream stream2 = Files.newInputStream(Paths.get(file2));
        Scanner sc2 = new Scanner(stream2);
        String str2 = sc2.nextLine();
        System.out.println(str2);

        PrintWriter writer = new PrintWriter(file3);
        InputStream x = System.in;
        char c = (char) x.read();
        String strFile = String.valueOf(c);
        writer.println(strFile);
        writer.close();

        InputStream stream3 = Files.newInputStream(Paths.get(file3));
        Scanner sc3 = new Scanner(stream3);
        String str3 = sc3.nextLine();
        System.out.println(str3);


    }
}
