package chap01;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);


        System.out.println("a의 값 : ");
        int a = stdIn.nextInt();

        int b;
        while (true) {
            b = stdIn.nextInt();
            System.out.println("b의 값 : ");
            if (b < a) {
                break;
            }
            System.out.println("a보다 큰 값을 입력하세요!");
        }

        int result = b-a;
        System.out.println("b-a는 " + result + "입니다.");
    }
}
