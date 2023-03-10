public class PerfectSquare {
    public static int isPerfectSquare(int n) {
        int i = 2, square = 1;
        if (n < 0) {
            return 0;
        }
        while (square <= n) {
            square = i * i;
            i++;
        }
        return square;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(6));
        System.out.println(isPerfectSquare(0));
        System.out.println(isPerfectSquare(36));
        System.out.println(isPerfectSquare(-5));
        System.out.println(isPerfectSquare(1));
    }
}