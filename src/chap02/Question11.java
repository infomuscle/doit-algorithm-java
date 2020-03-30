package chap02;

public class Question11 {


    static class YMD {
        int y;
        int m;
        int d;

        int[][] mdays = {
                {31,28,31,30,31,30,31,31,30,31,30,31},
                {31,29,31,30,31,30,31,31,30,31,30,31}
        };

        YMD(int y, int m, int d) {
            this.y = y;
            this.m = m;
            this.d = d;
        }

        int after(int n) {
            int tempy = y;
            int tempm = m;
            int tempd = d;
            while (n!= 0) {
                d += 1;
                if (d > mdays[isLeap(y)][m - 1]) {
                    m += 1;
                    d = 1;
                    if (m > 12) {
                        y += 1;
                        m = 1;
                    }
                }
                n -= 1;
            }
            int answer = d;
            y = tempy;
            m = tempm;
            d = tempd;
            return answer;
        }

        int before(int n) {
            int tempy = y;
            int tempm = m;
            int tempd = d;
            while (n!= 0) {
                d -= 1;
                if (d < 1) {
                    m -= 1;
                    if (m < 1) {
                        y -= 1;
                        m = 12;
                    }
                    d = mdays[isLeap(y)][m-1];
                }
                n -= 1;
            }
            int answer = d;
            y = tempy;
            m = tempm;
            d = tempd;
            return answer;
        }

        int isLeap(int year) {
            return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
        }
    }

    public static void main(String[] args) {
        YMD ymd = new YMD(2020, 1, 2);
        System.out.println(ymd.after(3));
        System.out.println(ymd.before(2));
    }
}
