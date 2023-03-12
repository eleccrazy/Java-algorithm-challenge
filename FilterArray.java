/**
 * 3. A binary representation of a number can be used to select elements from an
 * array. For example,
 * n:
 * 88 = 23 + 24 + 26 (1011000)
 * array: 8, 4, 9, 0, 3, 1, 2
 * indexes 0 1 2 3 4 5 6
 * selected
 * * *
 * result
 * 0, 3, 2
 * so the result of filtering {8, 4, 9, 0, 3, 1, 2} using 88 would be {0, 3, 2}
 * In the above, the elements that are selected are those whose indices are used
 * as exponents in the binary representation of 88. In other
 * words, a[3], a[4], and a[6] are selected for the result because 3, 4 and 6
 * are the powers of 2 that sum to 88.
 * Write a method named filterArray that takes an array and a non-negative
 * integer and returns the result of filtering the array using the
 * binary representation of the integer. The returned array must big enough to
 * contain the filtered elements and no bigger. So in the above
 * example, the returned array has length of 3, not 7 (which is the size of the
 * original array.) Futhermore, if the input array is not big
 * enough to contain all the selected elements, then the method returns null.
 * For example, if n=3 is used to filter the array a = {18},
 * the method should return null because 3=20+21 and hence requires that the
 * array have at least 2 elements a[0] and a[1], but there is no
 * a[1].
 * If you are using Java or C#, the signature of the function is
 * int[ ] filterArray(int[ ] a, int n)
 * If you are using C or C++, the signature of the function is
 * int * filterArray(int a[ ], int len, int n) where len is the length of the
 * array a
 * Hint: Proceed as follows
 * a. Compute the size of the returned array by counting the number of 1s in the
 * binary representation of n (You can use modulo 2
 * arithmetic to determine the 1s in the binary represention of n)
 * b. Allocate an array of the required size
 * c. Fill the allocated array with elements selected from the input array
 */

public class FilterArray {
    public static int[] filterArray(int[] a, int n) {
        int i = 0, j = 0, lenCount = 0, count = 0;
        int nCache = n;
        while (nCache != 0) {
            if (nCache % 2 == 1) {
                count++;
            }
            nCache /= 2;
            lenCount++;
        }
        if (lenCount > a.length) {
            return null;
        }
        int[] filteredArray = new int[count];
        while (n != 0) {
            if (n % 2 == 1) {
                filteredArray[j++] = a[i];
            }
            i++;
            n /= 2;
        }
        return filteredArray;
    }

    /*
     * This printArray method doesn't do anything on solving the problem.
     * It is just used to verify the output by printing the array using the format.
     */
    public static void printArray(int[] a) {
        if (a == null) {
            System.out.println("null");
            return;
        }
        System.out.print("{");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("}");
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(filterArray(new int[] { 8, 4, 9, 0, 3, 1, 2 }, 88)); // {0, 3, 2}
        printArray(filterArray(new int[] { 9, -9 }, 0)); // returns {}
        printArray(filterArray(new int[] { 9, -9 }, 1)); // {9}
        printArray(filterArray(new int[] { 9, -9 }, 2)); // {-9}
        printArray(filterArray(new int[] { 9, -9 }, 3)); // {9, -9}
        printArray(filterArray(new int[] { 9, -9 }, 4)); // null
        printArray(filterArray(new int[] { 9, -9, 5 }, 3)); // {9, -9}
        printArray(filterArray(new int[] { 0, 9, 12, 18, -6 }, 11)); // {0, 9, 18}
    }
}