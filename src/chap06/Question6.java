package chap06;

import java.util.Scanner;

public class Question6 {

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void selectionSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            print(a, i, min);
            swap(a, i, min);
        }
    }

    static void print(int[] a, int first, int least) {

        for (int i = 0; i < a.length; i++) {
            if (i == first) {
                System.out.print("*" + " ");
            } else if (i == least) {
                System.out.print("+" + " ");
            } else {
                System.out.print(" " + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("단순 선택 정렬");
        int[] x = {6, 4, 8, 3, 1, 9, 7};

        selectionSort(x, x.length);
    }
}
