package chap01;

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("n 입력 : ");
        int n = stdIn.nextInt();

        triangleLB(n);
        System.out.println();
        triangleLU(n);
        System.out.println();
        triangleRB(n);
        System.out.println();
        triangleRU(n);
        System.out.println();
    }

    static void triangleLB(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleLU(int n){
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRU(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRB(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
