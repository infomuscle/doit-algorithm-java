package chap01;

import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("n 입력 : ");
        int n = stdIn.nextInt();

        for (int i = 1; i <= n; i++) {
            String spaces = "";
            for (int j = n - i; j >= 1; j--) {
                spaces += " ";
            }
            String stars = "";
            for (int j = 1; j <= (2 * i - 1); j++) {
                stars += "*";
            }
            System.out.println(spaces + stars);
        }
    }
}
