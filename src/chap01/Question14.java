package chap01;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("사각형을 출력합니다.");
        System.out.println("단수 : ");
        int n = stdIn.nextInt();

        for (int i = 0; i < n; i++) {
            String square = "";
            for (int j = 0; j < n; j++) {
                square += "*";
            }
            System.out.println(square);
        }
    }
}
