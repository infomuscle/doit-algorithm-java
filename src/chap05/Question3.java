package chap05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question3 {

    static void print(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }

    static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }

    static int gcdArray(int[] a) {

        Arrays.sort(a);

        int cnt = 1;
        for (int i = 1; i < a.length; i++) {
            a[i] = a[i] % a[0];
            if (a[i] != 0) {
                cnt++;
            }
        }

        int idx = 0;
        int[] b = new int[cnt];
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                b[idx++] = a[i];
            }
        }

        if (b.length == 2) {
            return gcd(b[0], b[1]);
        } else if (b.length == 1) {
            return b[0];
        } else {
            return gcdArray(b);
        }
    }

    public static void main(String[] args) {

        int[] a = {22,11,55,44,33};
        System.out.println(gcdArray(a));
    }
}
