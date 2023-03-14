/**
 * 1. An integer is defined to be “continuous factored” if it can be expressed
 * as the product of two or
 * more continuous integers greater than 1.
 * Examples of “continuous factored” integers are:
 * 6 = 2 * 3.
 * 60 = 3 * 4 * 5
 * 120 = 4 * 5 * 6
 * 90 = 9*10
 * Examples of integers that are NOT “continuous factored” are: 99 = 9*11,
 * 121=11*11, 2=2, 13=13
 * Write a function named isContinuousFactored(int n) that returns 1 if n is
 * continuous factored and 0
 * otherwise.
 */

public class ContinuousFactored {
    static int isContinuousFactored(int n) {
        int product;
        for (int i = 2; i < n; i++) { // 13
            product = 1;
            if (n % i == 0) {
                product *= i;
                for (int j = i + 1; product < n; j++) {
                    product *= j;
                }
                if (product == n) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isContinuousFactored(6)); // 1
        System.out.println(isContinuousFactored(60)); // 1
        System.out.println(isContinuousFactored(90)); // 1
        System.out.println(isContinuousFactored(120)); // 1
        System.out.println(isContinuousFactored(99)); // 0
        System.out.println(isContinuousFactored(121)); // 0
        System.out.println(isContinuousFactored(13)); // 0
        System.out.println(isContinuousFactored(2)); // 0
    }
}