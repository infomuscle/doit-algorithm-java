package chap04;

import java.util.Scanner;
import java.util.Stack;

class Gstack<E> {
    private int max;
    private int ptr;
    private E [] stk;

    public static class EmptyGstackException extends RuntimeException {
        public EmptyGstackException() {}
    }

    public static class OverflowGstackException extends RuntimeException {
        public OverflowGstackException() {}
    }

    public Gstack(int capacity) {
        max = capacity;
        ptr = 0;
        try {
            stk = (E[]) new Object[10];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public E push(E x) throws OverflowGstackException {
        if (ptr >= max) {
            throw new OverflowGstackException();
        }
        return stk[ptr++] = x;
    }

    public E pop() throws EmptyGstackException{
       if (ptr <= 0) {
           throw new EmptyGstackException();
       }
        return stk[--ptr];
    }

    public E peek() {
        return stk[ptr-1];
    }

    public int size() {
        return ptr;
    }

    public int capacity() {
        return max;
    }

    public void dump() {
        for (int i = 0; i < ptr; i++) {
            System.out.print(stk[i]);
        }
        System.out.println();
    }

    public int indexOf(E x) {
        for (int i = ptr - 1; i >= 0; i--) {
            if (stk[i].equals(x)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return ptr <= 0;
    }

    public boolean isFull() {
        return ptr >= max;
    }

    public void clear() {
        ptr = 0;
    }
}

public class Question2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Gstack g = new Gstack<Integer>(64);

        while (true) {
            System.out.println("현재 데이터 수 : " + g.size() + " / " + g.capacity());
            System.out.print("(1) 푸시  (2) 팝  (3) 피크  (4) 덤프  (5) 검색  (6) 상태  (7) 클리어  (0) 종료 : ");

            int menu = stdIn.nextInt();
            if (menu == 0) {
                break;
            }

            Object x;
            switch (menu) {
                case 1:
                    System.out.print("데이터 : ");
                    x = stdIn.nextInt();
                    try {
                        g.push(x);
                    } catch (IntStack.OverflowIntStackException e) {
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;
                case 2:
                    try {
                        x = (Integer) g.pop();
                        System.out.println("팝한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;
                case 3:
                    try {
                        x = g.peek();
                        System.out.println("피크한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;
                case 4:
                    g.dump();
                    break;
                case 5:
                    System.out.print("검색할 데이터 : ");
                    x = stdIn.nextInt();
                    int idx = g.indexOf(x);
                    if (idx == -1) {
                        System.out.println("해당 데이터가 없습니다.");
                    } else {
                        System.out.println("x의 위치는 인덱스 " + idx + "입니다.");
                    }
                    break;
                case 6:
                    if (g.isEmpty()) {
                        System.out.println("스택이 비어 있습니다.");
                    } else if (g.isFull()) {
                        System.out.println("스택이 가득 찼습니다.");
                    } else {
                        x = g.size();
                        System.out.println("현재 스택의 크기는 " + x + "입니다.");
                    }
                    break;
                case 7:
                    g.clear();
                    System.out.println("스택을 모두 비웠습니다.");
                    break;
            }
        }
    }
}

