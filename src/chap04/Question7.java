package chap04;

import java.util.Deque;

public class Question7 {
    public static void main(String[] args) {

        IntDeque dq = new IntDeque(10);
        dq.print();

        for (int i = 0; i < 5; i++) {
            dq.enqueFront(i + 1);
        }
        for (int i = 5; i < 10; i++) {
            dq.enqueRear(i + 1);
        }
        dq.dump();dq.print();

//        dq.enqueFront(1);
//        dq.dump();dq.print();
//
//        dq.enqueFront(2);
//        dq.dump();dq.print();
//
//        dq.enqueRear(3);
//        dq.dump();dq.print();

    }
}

class IntDeque {
    int max;
    int num;
    int front;
    int rear;
    int[] que;

    public class EmptyDequeException extends RuntimeException {
        public EmptyDequeException() {
        }
    }

    public class OverflowDequeueException extends RuntimeException {
        public OverflowDequeueException() {
        }
    }

    public IntDeque(int capacity) {
        num = front = rear = 0;
        max = capacity;
        que = new int[max];
    }

    public int enqueFront(int x) throws OverflowDequeueException {
        if (num >= max) {
            throw new OverflowDequeueException();
        }
        if (--front < 0) {
            front = max - 1;
        }
        que[front] = x;
        num++;
        return x;
    }

    public int enqueRear(int x) throws OverflowDequeueException {
        if (num >= max) {
            throw new OverflowDequeueException();
        }
        que[rear++] = x;
        num++;
        if (rear >= max) {
            rear = 0;
        }
        return x;
    }

    public int dequeFront() throws EmptyDequeException {
        if (num <= 0) {
            throw new EmptyDequeException();
        }
        int x = que[front++];
        num--;
        if (front >= max) {
            front = 0;
        }
        return x;
    }

    public int dequeRear()throws EmptyDequeException {
        if (num <= 0) {
            throw new EmptyDequeException();
        }
        if (--rear < 0) {
            rear = max - 1;
        }
        int x = que[rear];
        num--;
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

    public void print() {
        for (int i = 0; i < max; i++) {
            System.out.print(que[i] + " ");
        }
        System.out.println();
    }
}

