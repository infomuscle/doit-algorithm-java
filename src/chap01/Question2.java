package chap01;

import java.util.Scanner;

public class Question2 {

    static int min3(int a, int b, int c) {
        int min = a;

        if (min > b) min = b;
        if (min > c) min = c;

        return min;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int c = stdIn.nextInt();

        System.out.println(min3(a,b,c));
    }
}
