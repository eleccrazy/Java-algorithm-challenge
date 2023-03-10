
/**
 * An array is defined to be inertial if the following conditions hold:
 * a. it contains at least one odd value
 * b. the maximum value in the array is even
 * c. every odd value is greater than every even value that is not the maximum
 * value.
 * So {11, 4, 20, 9, 2, 8} is inertial because
 * a. it contains at least one odd value
 * b. the maximum value in the array is 20 which is even
 * c. the two odd values (11 and 9) are greater than all the
 * even values that are not equal to 20 (the maximum), i.e., (4, 2, 8}.
 * However, {12, 11, 4, 9, 2, 3, 10} is not inertial because it fails condition
 * (c), i.e., 10 (which is
 * even) is greater 9 (which is odd) but 10 is not the maximum value in the
 * array.
 * Write a function called isIntertial that accepts an integer array and returns
 * 1 if the array is
 * inertial; otherwise it returns 0.
 * If you are programming in Java or C#, the function signature is
 * int isInertial(int[ ] a)
 * If you are programming in C or C++, the function signature is
 * int isInertial(int a[ ], int len) where len is the number of elements in the
 * array
 */
import java.util.Arrays;

public class Inertial {

    public static int isInertial(int[] a) {
        int len = a.length;
        int count = 0;
        boolean flag = false;
        if (len <= 1) {
            return 0;
        }
        int max = a[0];
        for (int i = 0; i < len; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] % 2 != 0) {
                flag = true;
                count++;
            }
        }
        int maxCounter = 0;
        for (int j = 0; j < len; j++) {
            if (a[j] == max) {
                maxCounter++;
            }
        }
        if (max % 2 != 0 || !flag) {
            return 0;
        }
        Arrays.sort(a);
        int idx = len - 1 - maxCounter;
        for (int i = 0; i < count; i++) {
            if (a[idx] % 2 == 0) {
                return 0;
            }
            idx--;
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] a = { 11, 4, 20, 9, 2, 8 };
        int[] b = { 12, 11, 4, 9, 2, 3, 10 };
        int[] c = { 1 };
        int[] d = { 2 };
        int[] e = { 1, 2, 3, 4 };
        int[] f = { 1, 1, 1, 1, 1, 1, 2 };
        int[] g = { 2, 12, 4, 6, 8, 11 };
        int[] h = { 2, 12, 12, 4, 6, 8, 11 };
        int[] i = { -2, -4, -6, -8, -11 };
        int[] j = { 2, 3, 5, 7 };
        int[] k = { 2, 4, 6, 8, 10 };
        System.out.println(isInertial(a));
        System.out.println(isInertial(b));
        System.out.println(isInertial(c));
        System.out.println(isInertial(d));
        System.out.println(isInertial(e));
        System.out.println(isInertial(f));
        System.out.println(isInertial(g));
        System.out.println(isInertial(h));
        System.out.println(isInertial(i));
        System.out.println(isInertial(j));
        System.out.println(isInertial(k));
    }
}