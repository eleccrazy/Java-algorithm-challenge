/**
 * 3. Using the <array, base> representation for a number described in the
 * second question write a method named convertToBase10 that
 * converts its <array, base> arguments to a base 10 number if the input is
 * legal for the specified base. If it is not, it returns -1.
 * Some examples:
 * convertToBase10(new int[ ] {1, 0, 1, 1}, 2) returns 11
 * convertToBase10(new int[ ] {1, 1, 2}, 3) returns 14
 * convertToBase10(new int[ ] {3, 2, 5}, 8) returns 213
 * convertToBase10 (new int[ ] {3, 7, 1}, 6) returns 0 because 371 is not a
 * legal base 6 number.
 */

public class ConvertToBaseTen {
    public static int isLegalNumber(int[] a, int base) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= base) {
                return 0;
            }
        }
        return 1;
    }

    public static int convertToBase10(int[] a, int base) {
        int decimal = 0;
        int c = 0;
        if (isLegalNumber(a, base) == 0) {
            return 0;
        }
        for (int i = a.length - 1; i >= 0; i--) {
            decimal += (a[i] * (Math.pow(base, c++)));
        }
        return decimal;
    }

    public static void main(String[] args) {
        System.out.println(convertToBase10(new int[] { 1, 0, 1, 1 }, 2));
        System.out.println(convertToBase10(new int[] { 1, 1, 2 }, 3));
        System.out.println(convertToBase10(new int[] { 3, 2, 5 }, 8));
        System.out.println(convertToBase10(new int[] { 3, 7, 1 }, 6));
    }
}