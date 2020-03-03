package chap01;

public class Question12 {
    public static void main(String[] args) {
        String head = "   |";
        String body = "";
        for (int i = 1; i <= 9; i++) {
            head += String.format("%3d", i);
            body += String.format("\n%3d|", i);
            for (int j = 1; j <= 9; j++) {
                body += String.format("%3d", i * j);
            }
        }
        head += "\n---+----------------------------";
        System.out.printf(head);
        System.out.println(body);
    }
}
