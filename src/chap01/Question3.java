package chap01;

import java.util.Scanner;

public class Question3 {

    static int min4(int a, int b, int c, int d) {
        int min = a;

        if (min > b) min = b;
        if (min > c) min = c;
        if (min > d) min = d;

        return min;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int c = stdIn.nextInt();
        int d = stdIn.nextInt();

        System.out.println(min4(a,b,c,d));
    }
}
