package chap01;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int sum = 0;

        if (n%2 == 0) {
            sum = (1+n) * (n/2);
        } else {
            sum = n + n* ((n-1)/2);
        }

        System.out.println(sum);
    }
}
