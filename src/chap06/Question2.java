package chap06;

import java.util.Scanner;
import java.util.concurrent.Exchanger;

public class Question2 {

    static int compare = 0;
    static int exchange = 0;

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void print(int[] a, int idx) {
        for (int i = 0; i < a.length; i++) {
            if (i == idx) {
                if (a[idx - 1] > a[idx]) {
                    System.out.print("+");
                } else {
                    System.out.print("-");
                }
            } else {
                System.out.print(" ");
            }
            System.out.print(a[i]);
        }
        System.out.println();
    }

    static void bubbleSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            System.out.println("패스 " + (i + 1));
            for (int j = n - 1; j > i; j--) {
                print(a, j);
                compare++;
                if (a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                    exchange++;
                }
            }
            print(a, -1);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("버블 정렬");
        int nx = 7;
        int[] x = {6, 4, 3, 7, 1, 9, 8};


        bubbleSort(x, nx);

        System.out.println("비교를 " + compare + "회 했습니다.");
        System.out.println("교환을 " + exchange + "회 했습니다.");
    }
}
