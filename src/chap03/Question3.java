package chap03;

public class Question3 {

    static int searchIdx(int[] a, int n, int key, int[] idx) {

        int idxForidx = 0;
        int size = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                idx[idxForidx++] = i;
                size++;
            }
        }
        return size;
    }

    public static void main(String[] args) {
        int num = 8;

        int[] x = {1, 9, 2, 9, 4, 6, 7, 9};
        int[] result = new int[num];

        int size = searchIdx(x, num, 9, result);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();

        System.out.println(size);
    }
}
