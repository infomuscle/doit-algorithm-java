package chap01;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int num = stdIn.nextInt();

        int length = 1;
        while (true) {
            num /= 10;
            if (num == 0) {
                break;
            }
            length += 1;
        }
        System.out.println("그 수는 " + length + "자리입니다.");
    }
}
