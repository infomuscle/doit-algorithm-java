package chap03;

import java.util.Scanner;

public class Question2 {

    public static void header(int[] a) {
        System.out.print("   |");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%3s", i);
        }
        System.out.print("\n---+");
        for (int i = 0; i < a.length; i++) {
            System.out.print("---");
        }
        System.out.println();
    }
    public static void indexer(int[] a, int n) {
        System.out.print("   |");
        for (int i = 0; i < a.length; i++) {
            if (i == n) {
                System.out.printf("%3s", "*");
            } else {
                System.out.print("   ");
            }
        }
        System.out.println();
    }

    public static void bodier(int[] a, int n) {
        System.out.printf("%3s|", n);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%3s", a[i]);
        }
        System.out.println();
    }

    public static int seqSearch(int[] a, int key) {

        for (int i = 0; i < a.length; i++) {
            indexer(a, i);
            bodier(a, i);
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
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

        System.out.print("검색할 수 : ");
        int key = stdIn.nextInt();

        header(x);
        int idx = seqSearch(x, key);
        if (idx == -1) {
            System.out.println("찾는 값이 없습니다.");
        } else {
            System.out.println(key + "은(는) x[" + idx + "]에 있습니다.");
        }
    }
}
