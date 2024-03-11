package lesson9;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите три слова:");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();

        System.out.println("Слова в обратном порядке:");
        System.out.println(word3);
        System.out.println(word2);
        System.out.println(word1);



    }
}
