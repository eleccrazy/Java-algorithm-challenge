public class UpCount {
    public static int nUpCount(int[] a, int n) {
        int count = 0, upSum = 0;
        boolean flag = true;

        for (int i = 0; i < a.length; i++) {
            upSum += a[i];
            if (upSum > n && flag) {
                count++;
                flag = false;
            }
            if (upSum < n) {
                flag = true;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = { 2, 3, 1, 2, 8, -3, -1, 2 };
        System.out.println(nUpCount(a, 5));
    }
}