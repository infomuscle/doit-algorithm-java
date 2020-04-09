package chap04;

import java.util.Scanner;

class DoubleStack {
    int capa;
    int lPtr;
    int rPtr;
    int[] stk;

    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {
        }
    }

    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {
        }
    }

    public DoubleStack(int capa) {
       this.capa = capa;
       this.lPtr = 0;
       this.rPtr = capa-1;
       this.stk = new int[capa];
    }

    public int leftPush(int x) throws OverflowIntStackException {
        if (lPtr == rPtr + 1) {
            throw new OverflowIntStackException();
        }
        return stk[lPtr++] = x;
    }

    public int rightPush(int x) throws OverflowIntStackException {
        if (rPtr == lPtr - 1) {
            throw new OverflowIntStackException();
        }
        return stk[rPtr--] = x;
    }

    public int leftPop() throws EmptyIntStackException {
        if (lPtr <= 0) {
            throw new EmptyIntStackException();
        }
        int pop = stk[--lPtr];
        stk[lPtr] = 0;
        return pop;
    }

    public int rightPop() throws EmptyIntStackException {
        if (rPtr >= capa-1) {
            throw new EmptyIntStackException();
        }
        int pop = stk[++rPtr];
        stk[rPtr] = 0;
        return pop;
    }

    public void dump() {
        for (int i = 0; i < capa; i++) {
            System.out.print(stk[i] + " ");
        }
        System.out.println();
    }

    public int capacity() {
        return capa;
    }

    public int size() {
        return lPtr + (capa-1-rPtr);
    }
}

public class Question3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        DoubleStack ds = new DoubleStack(10);

        while (true) {
            System.out.println("현재 데이터 수 : " + ds.size() + " / " + ds.capacity());
            System.out.print("(1) Left Push  (2) Right Push  (3) Left Pop  (4) Right Pop  (5) Dump  (0) Break : ");
            int choice = stdIn.nextInt();

            if (choice == 0) {
                break;
            }

            int x;
            switch (choice) {
                case 1:
                    x = stdIn.nextInt();
                    try {
                        ds.leftPush(x);
                        System.out.println(x + " pushed to the left");
                    } catch (DoubleStack.OverflowIntStackException e) {
                        System.out.println("Stack is Full");
                    }
                    break;
                case 2:
                    x = stdIn.nextInt();
                    try {
                        ds.rightPush(x);
                        System.out.println(x + " pushed to the right");
                    } catch (DoubleStack.OverflowIntStackException e) {
                        System.out.println("Stack is Full");
                    }
                    break;
                case 3:
                    try {
                        x = ds.leftPop();
                        System.out.println(x + " poped from the left");
                    } catch (DoubleStack.EmptyIntStackException e) {
                        System.out.println("Left Stack is Empty");
                    }
                    break;
                case 4:
                    try {
                        x = ds.rightPop();
                        System.out.println(x + " poped from the right");
                    } catch (DoubleStack.EmptyIntStackException e) {
                        System.out.println("Right Stack is Empty");
                    }
                    break;
                case 5:
                    ds.dump();
                    break;
            }
        }
    }
}
