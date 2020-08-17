package chap05;

import java.util.HashMap;
import java.util.Map;

public class Question6 {

    static Map<Integer, String> map = new HashMap<Integer, String>();

    static void move(int n, int x, int y) {

        if (n > 1) {
            move(n - 1, x, 6 - x - y);
        }

        System.out.println("원반[" + n + "]을 " + map.get(x) + "기둥에서 " + map.get(y) + "기둥으로 옮김");

        if (n > 1) {
            move(n - 1, 6 - x - y, y);
        }
    }

    public static void main(String[] args) {

        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        int n = 3;

        move(n, 1, 3);
    }
}
