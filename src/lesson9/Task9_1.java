package lesson9;

import java.io.IOException;
import java.io.InputStream;

public class Task9_1 {
    public static void main(String[] args) throws IOException {
        int m = 0;
        while (m <= 5){
            InputStream x = System.in;
            char c = (char) x.read();
            String str = String.valueOf(c);
            m++;
            System.out.print(str);
        }



    }
}
