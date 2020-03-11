package chap02;

import java.util.Scanner;

public class Question2 {
    static void swap(int[] a, int idx1, int idx2) {
        arrayPrinter(a);
        System.out.println("a[" + idx1 + "]과(와) a[" + idx2 + "]를 교환합니다.");
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            swap(a, i, a.length - 1 - i);
        }
    }

    static void arrayPrinter(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = stdIn.nextInt();

        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        reverse(x);

        System.out.println("역순 정렬을 마쳤습니다.");
        arrayPrinter(x);
    }
}
