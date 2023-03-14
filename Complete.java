/**
 * 3. An array is defined to be complete if the conditions (a), (d) and (e)
 * below hold.
 * a. The array contains even numbers
 * b. Let min be the smallest even number in the array.
 * c. Let max be the largest even number in the array.
 * d. min does not equal max
 * e. All numbers between min and max are in the array
 * For example {-5, 6, 2, 3, 2, 4, 5, 11, 8, 7} is complete because
 * a. The array contains even numbers
 * b. 2 is the smallest even number
 * c. 8 is the largest even number
 * d. 2 does not equal 8
 * e. the numbers 3, 4, 5, 6, 7 are in the array.
 * Examples of arrays that are not complete are:
 * {5, 7, 9, 13} condition (a) does not hold, there are no even numbers.
 * {2, 2} condition (d) does not hold
 * {2, 6, 3, 4} condition (e) does not hold (5 is missing)
 * Write a function named isComplete that returns 1 if its array argument is a
 * complete array. Otherwise
 * it returns 0.
 * If you are writing in Java or C#, the function signature is
 * int isComplete (int[ ] a)
 * If you are writing in C or C++, the function signature is
 * int isComplete (int a[ ], int len) where len is the number of elements in the
 * array.
 */
public class Complete {
    static int isComplete(int[] a) {
        int min = 0, max = 0, count = 0;
        if (a.length < 3 || a == null)
            return 0;
        max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                min = a[i];
                max = a[i];
                break;
            }
        }
        if (min == 0 || max == 0)
            return 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                count++;
                if (a[i] > max)
                    max = a[i];
                else if (a[i] < min)
                    min = a[i];
                else
                    continue;
            }
        }
        if (count < 2 || min == max)
            return 0;
        boolean flag;
        for (int i = min + 1; i < max; i++) {
            flag = false;
            for (int j = 0; j < a.length; j++) {
                if (i == a[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isComplete(new int[] { -5, 6, 2, 3, 2, 4, 5, 11, 8, 7 }));
    }
}