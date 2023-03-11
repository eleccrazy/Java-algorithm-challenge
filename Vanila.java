/**
 * 2. An array is called vanilla if all its elements are made up of the same
 * digit. For example {1, 1, 11, 1111, 1111111} is a vanilla array
 * because all its elements use only the digit 1. However, the array {11, 101,
 * 1111, 11111} is not a vanilla array because its elements use the
 * digits 0 and 1. Write a method called isVanilla that returns 1 if its
 * argument is a vanilla array. Otherwise it returns 0.
 * If you are writing in Java or C#, the function signature is
 * int isVanilla(int[ ] a)
 * If you are writing in C or C++, the function signature is
 * int isVanilla(int a[ ], int len) where len is the number of elements in the
 * array a.
 */

public class Vanila {

    public static int isVanilla(int[] a) {
        int baseDigit = 0;
        int element;
        if (a.length > 0) {
            baseDigit = Math.abs(a[0] % 10);
        }
        for (int i = 0; i < a.length; i++) {
            element = a[i];
            while (element != 0) {
                if (Math.abs(element % 10) != baseDigit) {
                    return 0;
                }
                element /= 10;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isVanilla(new int[] { 1, 1, 11, 1111, 1111111 }));
        System.out.println(isVanilla(new int[] { 11, 101, 1111, 11111 }));
        System.out.println(isVanilla(new int[] { 1 }));
        System.out.println(isVanilla(new int[] { 11, 22, 13, 34, 125 }));
        System.out.println(isVanilla(new int[] { 9, 999, 99999, -9999 }));
        System.out.println(isVanilla(new int[] {}));
    }
}