public class LargestAdjacentSum {
    public static int largestAdjacentSum(int[] a) {
        int sum, max = a[0] + a[1];
        for (int i = 2; i < a.length; i++) {
            sum = a[i] + a[i - 1];
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(largestAdjacentSum(new int[] { 1, 2, 3, 4 })); // returns 7
        System.out.println(largestAdjacentSum(new int[] { 18, -12, 9, -10 })); // returns 6
        System.out.println(largestAdjacentSum(new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1 })); // returns 2
        System.out.println(largestAdjacentSum(new int[] { 1, 1, 1, 1, 1, 2, 1, 1, 1 })); // returns 3
    }
}