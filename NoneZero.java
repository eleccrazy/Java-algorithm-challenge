/**
 * Check if the array contains non zero elements.
 * Return 1 if all elements are non zero, otherwise it returns 0
 */

public class NoneZero {

    public static int arrayHasNoZeros(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(arrayHasNoZeros(new int[] { 1, 2, 3 }));
        System.out.println(arrayHasNoZeros(new int[] { 1, 0, 4, 0 }));
        System.out.println(arrayHasNoZeros(new int[] { 0, 0, 0, 0 }));
        System.out.println(arrayHasNoZeros(new int[] { 1, 2, 3, 0 }));
        System.out.println(arrayHasNoZeros(new int[] {}));
    }
}