/**
 * 1. Define the fullness quotient of an integer n > 0 to be the number of
 * representations of n in bases 2 through 9 that have no zeroes anywhere after
 * the most significant digit. For example, to see why the fullness quotient of
 * 94 is 6 examine the following table which shows the representations of 94
 * in bases 2 through 9.
 * Notice that the representations of 94 in base 2 and 3 both have 0s
 * 
 * somewhere after the most significant digit, but the representations in bases
 * 4, 5, 6, 7, 8, 9 do not. Since there are 6 such
 * representations, the fullness quotient of 94 is 6.
 * Write a method named fullnessQuotient that returns the fullness quotient of
 * its argument. If the argument is less than 1 return -1. Its
 * signature is
 * int fullnessQuotient(int n)
 * Hint: use modulo and integer arithmetic to convert n to its various
 * representations
 */

public class FullnessQuetient {

    public static int fullnessQuotient(int n) {
        int count = 0, nCache;
        boolean flag;
        if (n <= 0) {
            return -1;
        }
        for (int i = 2; i <= 9; i++) {
            nCache = n;
            flag = true;
            while (nCache != 0) {
                if (nCache % i == 0) {
                    flag = false;
                    break;
                }
                nCache /= i;
            }
            if (flag) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(fullnessQuotient(94)); // returns 6
        System.out.println(fullnessQuotient(1)); // returns 8
        System.out.println(fullnessQuotient(9)); // returns 5
        System.out.println(fullnessQuotient(360)); // returns 0
        System.out.println(fullnessQuotient(-4)); // returns -1
    }
}