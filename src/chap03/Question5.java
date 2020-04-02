package chap03;

import java.util.Scanner;

public class Question5 {

    public static int binSearch(int[] a, int n, int key) {
        int pl = 0;
        int pr = n-1;
        int pc;

        while (pl < pr) {
            pc = (pl + pr) / 2;

            if (a[pc] == key) {
                while (a[pc-1] == a[pc]) {
                    pc = pc - 1;
                    if (pc == 0) {
                        break;
                    }
                }
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

        int idx = binSearch(x, num, key);
        if (idx == -1) {
            System.out.println("찾는 값이 없습니다.");
        } else {
            System.out.println(key + "은(는) x[" + idx + "]에 있습니다.");
        }
    }
}
