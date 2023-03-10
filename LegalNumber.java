/**
 * 2. A number with a base other than 10 can be written using its base as a
 * subscript. For example, 10112 represents the binary number
 * 1011 which can be converted to a base 10 number as follows:
 * (1 * 20) + (1 * 21) + (0 * 22) + (1 * 23) = 1 + 2 + 0 + 8 = 1110Similarily,
 * the base 3 number 1123 can be converted to base 10 as follows:
 * (2 * 30) + (1 * 31) + (1 * 32) = 2 + 3 + 9 = 1410
 * And the base 8 number 3258 can be converted to base 10 as follows:
 * (5 * 80) + (2 * 81) + (3 * 82) = 5 + 16 + 192 = 21310
 * Write a method named isLegalNumber that takes two arguments. The first
 * argument is an array whose elements are the digits of the
 * number to test. The second argument is the base of the number represented by
 * the first argument. The method returns 1 if the number
 * represented by the array is a legal number in the given base, otherwise it
 * returns 0.
 * For example the number 3214 can be passed to the method as follows:
 * isLegalNumber(new int[] {3, 2, 1}, 4)
 * This call will return 1 because 3214 is a legal base 4 number.
 * However, since all digits of a base n number must be less than n, the
 * following call will return 0 because 3716 is not a legal base 6
 * number (the digit 7 is not allowed)
 * isLegalNumber(new int[] {3, 7, 1}, 6)
 * If you are programming in Java or C#, the signature of the method is
 * int isLegalNumber(int[ ] a, int base)
 * If you are programming in C or C++, the signature of the method is
 * int isLegalNumber(int a[ ], int len, int base) where len is the size of the
 * array.
 */

public class LegalNumber {

    public static int isLegalNumber(int[] a, int base) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= base) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isLegalNumber(new int[] { 3, 2, 1 }, 4));
        System.out.println(isLegalNumber(new int[] { 3, 7, 1 }, 6));
    }
}