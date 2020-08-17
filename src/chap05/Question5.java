package chap05;

import com.sun.source.tree.ContinueTree;

import java.util.Scanner;
import java.util.Stack;

public class Question5 {

    static void recur3(int n) {
        if (n > 0) {
            recur3(n - 1);
            recur3(n - 2);
            System.out.println(n);
        }
    }

    static void norecur3(int n) {
        Stack stk1 = new Stack();
        Stack stk2 = new Stack();
        int sw = 0;

        while (true) {

            if (n > 0) {
                stk1.push(n);
                stk2.push(sw);

                if (sw == 0) {
                    n = n - 1;
                } else if (sw == 1) {
                    n = n - 2;
                    sw = 0;
                }

                continue;
            }

            do {
                n = (int) stk1.pop();
                sw = (int) stk2.pop() + 1;

                if (sw == 2) {
                    System.out.println(n);
                    n = n - 1;
                    if (stk1.isEmpty()) {
                        return;
                    }
                }
            } while (sw == 2);
        }
    }

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int n = 3;

//        recur3(n);
        norecur3(n);
    }
}
