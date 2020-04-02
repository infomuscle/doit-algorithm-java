package chap03;

import java.util.Scanner;

public class Question1 {
    static int seqSearchSen(int[] a, int n, int key) {

        a[n] = key;
        int answer = -1;

        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                answer = i;
                break;
            }
        }

        return (answer == n) ? -1 : answer;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num + 1];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색할 값 : ");
        int ky = stdIn.nextInt();

        int idx = seqSearchSen(x, num, ky);

        if (idx == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
        }
    }
}
