package chap01;

import java.util.Scanner;

public class Question9 {

    static int sumFronOne(int n){
        int sum = 0;

        if (n%2 == 0) {
            sum = (1+n) * (n/2);
        } else {
            sum = n + n* ((n-1)/2);
        }
        return sum;
    }

    static int sumOf(int a, int b) {
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        int sum = sumFronOne(b) - sumFronOne(a-1);

        return sum;
    }

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int a = stdIn.nextInt();
        int b = stdIn.nextInt();

        System.out.println(sumOf(a, b));
    }
}
