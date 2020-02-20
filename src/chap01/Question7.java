package chap01;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("n의 값을 입력하세요. : ");
        int n = stdIn.nextInt();
        int sum = 0;
        String result = "";

        for (int i = 1; i <= n; i++) {
            sum += i;
            if (i != n) {
                result += i + " + ";
            } else {
                result += i + " = " + sum;
            }
        }

        System.out.println(result);
    }
}
