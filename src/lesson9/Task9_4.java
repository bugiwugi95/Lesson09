package lesson9;

import java.io.IOException;
import java.io.InputStream;

public class Task9_4 {
    public static void main(String[] args) throws IOException {
        /*
        5.Пользователь вводит 7символов. Используя System.in (без сканнера),
        считайте целое число до первой нецифры.(пример: «35 руб», ответ 35.) считаем,
        что первым пользователь всегда вводит цифру
         */
//        int in = 0;
//        while (in <7){
//            InputStream x = System.in;
//            char c = (char) x.read();
//            if (c >= 48 && c <= 57){
//                String str = String.valueOf(c);
//                System.out.print(str);
//            }
//            in++;
//        }

        //Аналогично предыдущей задаче, но пользователь всегда вводит дробное число (пример ввода: «3.5 кг»)
        int in = 0;
        while (in < 7) {
            InputStream x = System.in;
            char c = (char) x.read();
            if (c >= 48 && c <= 57 || c == '.') {
                String str = String.valueOf(c);

                System.out.print(str);
            }
            in++;
        }


    }
}
