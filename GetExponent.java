/**
 * 1. Write a method named getExponent(n, p) that returns the largest exponent x
 * such that px evenly divides n. If p is <= 1 the method
 * should return -1.
 * For example, getExponent(162, 3) returns 4 because 162 = 2 1 * 34, therefore
 * the value of x here is 4.
 * The method signature is
 * int getExponent(int n, int p)
 */
public class GetExponent {
    static int getExponent(int n, int p) {
        int exponent = 0;
        if (n < 0)
            n *= -1;
        if (p == 1)
            return 1;
        while (n > 0) {
            if (n % p == 0) {
                exponent++;
                n = n / p;
            } else {
                break;
            }
        }
        return exponent;
    }

    public static void main(String[] args) {
        System.out.println(getExponent(162, 3)); // 4
        System.out.println(getExponent(27, 3)); // 3
        System.out.println(getExponent(28, 3)); // 0
        System.out.println(getExponent(280, 7)); // 1
        System.out.println(getExponent(-250, 5)); // 3
        System.out.println(getExponent(18, 1)); // 1
        System.out.println(getExponent(128, 4)); // 3
    }
}