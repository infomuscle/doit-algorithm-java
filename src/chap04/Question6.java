package chap04;

import java.lang.reflect.Array;

public class Question6 {
    public static void main(String[] args) {
        Gqueue<Integer> intQue = new Gqueue<Integer>(10, Integer.class);
        intQue.enque(1);
        intQue.enque(2);
        intQue.dump();
        System.out.println(intQue.peek());

        Gqueue<String> strQue = new Gqueue<String>(10, String.class);
        strQue.enque("Q");
        strQue.enque("u");
        strQue.enque("e");
        strQue.deque();
        strQue.dump();
        System.out.println(strQue.peek());
        System.out.println(strQue.indexOf("u"));
    }
}

class Gqueue<E> {
    private int max;
    private int num;
    private int front;
    private int rear;
    private E[] que;

    public static class EmptyGqueueException extends RuntimeException {
        public EmptyGqueueException() {}
    }

    public static class OverflowGqueueException extends RuntimeException {
        public OverflowGqueueException() {}
    }

    public Gqueue(int capacity, Class<E> clazz) {
        num = front = rear = 0;
        max = capacity;

        try {
            que = (E[]) Array.newInstance(clazz, max);
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public E enque(E x) throws OverflowGqueueException {
        if (num >= max) {
            throw new OverflowGqueueException();
        }
        que[rear++] = x;
        num++;
        if (rear >= max) {
            rear = 0;
        }
        return x;
    }

    public E deque() throws EmptyGqueueException {
        if (num <= 0) {
            throw new EmptyGqueueException();
        }
        E x = que[front++];
        num--;
        if (front >= max) {
            front = 0;
        }
        return x;
    }

    public void dump() {
        if (num <= 0) {
            System.out.println("큐가 비어있습니다.");
        } else {
            for (int i = 0; i < num; i++) {
                System.out.print(que[(i + front) % max] + " ");
            }
            System.out.println();
        }
    }

    public E peek() throws EmptyGqueueException {
        if (num <= 0) {
            throw new EmptyGqueueException();
        }
        return que[front];
    }

    public int indexOf(E x) {
        for (int i = 0; i < num; i++) {
            int idx = (i + front) % max;
            if (que[idx] == x) {
                return idx;
            }
        }
        return -1;
    }

    public int search(E x) {
        int seq = 0;
        for (int i = 0; i < num; i++) {
            seq += 1;
            int idx = (i + front) % max;
            if (que[idx] == x) {
                return seq;
            }
        }
        return 0;
    }

    public void clear() {
        num = front = rear = 0;
    }

    public int capacity() {
        return max;
    }

    public int size() {
        return num;
    }

    public boolean isEmpty() {
        return num <= 0;
    }

    public boolean isFull() {
        return num >= max;
    }
}
