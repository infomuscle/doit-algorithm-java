package chap05;

public class Question4 {

    static void recur2(int n) {
        if (n > 0) {
            recur2(n - 2);
            System.out.println(n);
            recur2(n - 1);
        }
    }

    public static void main(String[] args) {

        recur2(4);
    }
}


//                       하향식
//                      recur(4)
//         recur(2)      - 4 -       recur(3)
// recur(0) - 2 - recur(1) | recur(1) - 3 - recur(2)
//                   1          1   recur(0) - 2 - recur(1)
//                                                    1
//
// -> 2 1 3 1 3 2 1
//
// 상향식
// recur(1): recur(-1) - 1 - recur(0) -> 1
// recur(2): recur(0) - 2 -recur(1) -> 2 1
// recur(3): recur(1) - 3 - recur(2) -> 1 3 2 1
// recur(4): recur(2) - 4 - recur(3) -> 2 1 4 1 3 2 1