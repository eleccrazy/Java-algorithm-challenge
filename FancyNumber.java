/**
 * 1. A fancy number is a number in the sequence 1, 1, 5, 17, 61, … .Note that
 * first two fancy numbers
 * are 1 and any fancy number other than the first two is sum of the three times
 * previous one and two
 * times the one before that. See below:
 * 1,
 * 1,
 * 3*1 +2*1 = 5
 * 3*5 +2*1 = 17
 * 3*17 + 2*5 = 61
 * Write a function named isFancy that returns 1 if its integer argument is a
 * Fancy number, otherwise it
 * returns 0.
 * The signature of the function is
 * int isFancy(int n)
 */
public class FancyNumber {
    static int isFancy(int n) {
        if (n == 1)
            return 1;
        int first = 1, second = 1, current = 0;
        while (current < n) {
            current = 3 * second + 2 * first;
            if (current == n)
                return 1;
            first = second;
            second = current;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isFancy(61)); // 1
        System.out.println(isFancy(5)); // 1
        System.out.println(isFancy(17)); // 1
        System.out.println(isFancy(16)); // 0
        System.out.println(isFancy(0)); // 0
        System.out.println(isFancy(1)); // 1
    }
}