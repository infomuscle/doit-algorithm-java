package chap02;

public class Question8 {
    static int dayOfYear(int y, int m, int d) {
        while (--m != 0) {
            d += DayOfYear.mdays[DayOfYear.isLeap(y)][m-1];
        }
        return d;
    }

    public static void main(String[] args) {
        System.out.println(dayOfYear(2020, 4, 1));
    }
}
