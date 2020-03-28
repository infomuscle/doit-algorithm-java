package chap02;

public class Question9 {
    static int leftDayOfYear(int y, int m, int d) {
        d = DayOfYear.mdays[DayOfYear.isLeap(y)][m - 1] - d;
        while(m != 12) {
            d += DayOfYear.mdays[DayOfYear.isLeap(y)][m++];
        }
        return d;
    }

    public static void main(String[] args) {
        System.out.println(leftDayOfYear(2020,1, 1));
    }
}
