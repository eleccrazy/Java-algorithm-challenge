/**
 * 2. An integer array is defined to be sequentially-bounded if it is in
 * ascending order and each value, n, in the array occurs less than n
 * times in the array. So {2, 3, 3, 99, 99, 99, 99, 99} is sequentially-bounded
 * because it is in ascending order and the value 2 occurs less
 * than 2 times, the value 3 occurs less than 3 times and the value 99 occurs
 * less than 99 times. On the other hand, the array {1, 2, 3} is
 * not sequentially-bounded because the value 1 does not occur < 1 times. The
 * array {2, 3, 3, 3, 3} is not sequentially-bounded because
 * the maximum allowable occurrences of 3 is 2 but 3 occurs 4 times. The array
 * {12, 12, 9} is not sequentially-bounded because it is not
 * in ascending order.
 * Write a function named isSequentiallyBounded that returns 1 if its array
 * argument is sequentially-bounded, otherwise it returns 0.
 * • If you are programming in Java or C#, the function signature is int
 * isSequentiallyBounded(int[ ] a)
 * • If you are programming in C or C++, the function signature is int
 * isSequentiallyBounded(int a[ ], int len) where len is the length
 * of the array.
 */

public class SequentiallyBounded {
    public static int isSequentiallyBounded(int[] a) {
        int len = a.length;
        int element, counter;
        for (int i = 0; i < len; i++) {
            if (((i < len - 1) && (a[i] > a[i + 1])) || a[i] < 0) {
                return 0;
            }
        }
        for (int i = 0; i < len; i++) {
            element = a[i];
            counter = 0;
            for (int j = 0; j < len; j++) {
                if (element == a[j]) {
                    counter++;
                }
            }
            if (!(counter < element)) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isSequentiallyBounded(new int[] { 2, 3, 3, 99, 99, 99, 99, 99 }));
        System.out.println(isSequentiallyBounded(new int[] { 1, 2, 3 }));
        System.out.println(isSequentiallyBounded(new int[] { 2, 3, 3, 3, 3 }));
        System.out.println(isSequentiallyBounded(new int[] { 12, 12, 9 }));
        System.out.println(isSequentiallyBounded(new int[] { 0, 1 }));
        System.out.println(isSequentiallyBounded(new int[] { -1, 2 }));
        System.out.println(isSequentiallyBounded(new int[] {}));
        System.out.println(isSequentiallyBounded(new int[] { 5, 5, 5, 5 }));
        System.out.println(isSequentiallyBounded(new int[] { 5, 5, 5, 2, 5 }));
    }
}