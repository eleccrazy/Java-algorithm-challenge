/**
 * 1. An Evens number is an integer whose digits are all even. For example 2426
 * is an Evens number
 * but 3224 is not.
 * Write a function named isEvens that returns 1 if its integer argument is an
 * Evens number otherwise it
 * returns 0.
 */

public class Evens {
    public static int isEvens(int n) {
        while (n != 0) {
            if ((n % 10) % 2 != 0) {
                return 0;
            }
            n /= 10;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isEvens(125600)); // 0
        System.out.println(isEvens(0)); // 1
        System.out.println(isEvens(4428068)); // 1
        System.out.println(isEvens(-1)); // 0
        System.out.println(isEvens(-6420)); // 1
        System.out.println(isEvens(64508)); // 0
    }
}