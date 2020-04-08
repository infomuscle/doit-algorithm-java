package chap04;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        IntStack s = new IntStack(64);

        while (true) {
            System.out.println("현재 데이터 수 : " + s.size() + " / " + s.capacity());
            System.out.print("(1) 푸시  (2) 팝  (3) 피크  (4) 덤프  (5) 검색  (6) 상태  (7) 클리어  (0) 종료 : ");

            int menu = stdIn.nextInt();
            if (menu == 0) {
                break;
            }

            int x;
            switch (menu) {
                case 1:
                    System.out.print("데이터 : ");
                    x = stdIn.nextInt();
                    try {
                        s.push(x);
                    } catch (IntStack.OverflowIntStackException e) {
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;
                case 2:
                    try {
                        x = s.pop();
                        System.out.println("팝한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;
                case 3:
                    try {
                        x = s.peek();
                        System.out.println("피크한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;
                case 4:
                    s.dump();
                    break;
                case 5:
                    System.out.print("검색할 데이터 : ");
                    x = stdIn.nextInt();
                    int idx = s.indexOf(x);
                    if (idx == -1) {
                        System.out.println("해당 데이터가 없습니다.");
                    } else {
                        System.out.println("x의 위치는 인덱스 " + idx + "입니다.");
                    }
                    break;
                case 6:
                    if (s.isEmpty()) {
                        System.out.println("스택이 비어 있습니다.");
                    } else if (s.isFull()) {
                        System.out.println("스택이 가득 찼습니다.");
                    } else {
                        x = s.size();
                        System.out.println("현재 스택의 크기는 " + x + "입니다.");
                    }
                    break;
                case 7:
                    s.clear();
                    System.out.println("스택을 모두 비웠습니다.");
                    break;
            }
        }
    }
}

