package chap03;

import java.util.Scanner;

public class Question4 {

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

    public static void indexer(int[] a, int pl, int pc, int pr) {
        System.out.print("   |");
        for (int i = 0; i < a.length; i++) {
            if (i == pc) {
                System.out.printf("%3s", "+");
            } else if (i == pl) {
                System.out.printf("%3s", "<-");
            } else if (i == pr) {
                System.out.printf("%3s", "->");
            } else {
                System.out.printf("%3s", " ");
            }
        }
        System.out.println();
    }

    public static void bodier(int[] a, int pc) {
        System.out.printf("%3s|", pc);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%3s", a[i]);
        }
        System.out.println();
    }

    public static int binSearch(int[] a, int key) {
        int pl = 0;
        int pr = a.length-1;
        int pc;

        while (pl < pr) {
            pc = (pl + pr) / 2;
            indexer(a, pl, pc, pr);
            bodier(a, pc);

            if (a[pc] == key) {
                return pc;
            } else if (a[pc] > key) {
                pr = pc - 1;
            } else {
                pl = pc + 1;
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
        int idx = binSearch(x, key);
        if (idx == -1) {
            System.out.println("찾는 값이 없습니다.");
        } else {
            System.out.println(key + "은(는) x[" + idx + "]에 있습니다.");
        }
    }
}
