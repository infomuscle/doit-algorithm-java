package chap04;

class IntAryQueue {
    private int max;
    private int num;
    private int[] que;

    public IntAryQueue(int capacity) {
        this.max = capacity;
        this.num = 0;
        this.que = new int[capacity];
    }

    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() {}
    }

    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() {}
    }

    public void enque(int n) throws OverflowIntQueueException {
        if (num >= max) {
            throw new OverflowIntQueueException();
        }
        que[num++] = n;
        return;
    }

    public int deque() throws EmptyIntQueueException {
        if (num <= 0) {
            throw new EmptyIntQueueException();
        }
        int dequed = que[0];
        for (int i = 1; i < num; i++) {
            que[i - 1] = que[i];
        }
        num--;
        return dequed;
    }

    public int peek() throws EmptyIntQueueException {
        if (num <= 0) {
            throw new EmptyIntQueueException();
        }
        return que[0];
    }

    public int indexOf(int x) {
        for (int i = 0; i < num; i++) {
            if (que[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public void clear() {
        num = 0;
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

    public void dump() {
        if (num == 0) {
            System.out.println("큐가 비어있습니다.");
            return;
        }

        for (int i = 0; i < num; i++) {
            System.out.print(que[i] + " ");
        }
        System.out.println();
        return;
    }
}

public class Question4 {
    public static void main(String[] args) {
        IntAryQueue q = new IntAryQueue(10);

        q.enque(1);
        q.enque(2);
        q.size();
        q.dump();

        q.deque();
        q.dump();

        System.out.println(q.capacity());
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());

        q.enque(2);
        System.out.println(q.indexOf(3));

        q.clear();
        System.out.println(q.isEmpty());
        q.dump();

    }
}

