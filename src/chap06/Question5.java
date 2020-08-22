package chap06;

import java.util.Scanner;

public class Question5 {

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void bubbleSort(int[] a, int n) {
        int k = 0;
        int time = 0;
        while (k < n - 1) {
            System.out.println(++time);
            int last = n - 1;
            for (int j = n - 1; j > k; j--) {
                if (a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                    last = j;
                }
            }
            for (int j = last; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j+1);
                }
            }
            k = last;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("버블 정렬");
        int nx = 7;
        int[] x = {9,1,4,3,6,7,8};


        bubbleSort(x, nx);

        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }
}
