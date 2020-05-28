package chap05;

import java.util.Scanner;

public class Question1 {

    static int factorial(int x) {
        int result = 1;
        for (int i = 0; i < x; i++) {
            result *= i + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요. : ");
        int x = stdIn.nextInt();

        System.out.println("x의 팩토리얼은 " + factorial(x) + "입니다.");
    }
}