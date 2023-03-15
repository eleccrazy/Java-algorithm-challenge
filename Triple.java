/**
 * 3. Define a Triple array to be an array where every value occurs exactly
 * three times.
 * For example, {3, 1, 2, 1, 3, 1, 3, 2, 2} is a Triple array.
 * The following arrays are not Triple arrays
 * {2, 5, 2, 5, 5, 2, 5} (5 occurs four times instead of three times)
 * {3, 1, 1, 1} (3 occurs once instead of three times)
 * Write a function named isTriple that returns 1 if its array argument is a
 * Triple array. Otherwise it
 * returns 0.
 * If you are programming in Java or C#, the function signature is
 * int isTriple (int[ ] a)
 * If you are programming in C or C++, the function signature is
 * int isTriple (int a[ ], int len) where len is the number of elements in the
 * array.
 */
public class Triple {

    static int isTriple(int[] a) {
        int counter;
        for (int i = 0; i < a.length; i++) {
            counter = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j])
                    counter++;
            }
            if (counter != 3)
                return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isTriple(new int[] { 3, 1, 2, 1, 3, 1, 3, 2, 2 })); // 1
        System.out.println(isTriple(new int[] { 2, 5, 2, 5, 5, 2, 5 })); // 0
        System.out.println(isTriple(new int[] { 3, 1, 1, 1 })); // 0
    }
}