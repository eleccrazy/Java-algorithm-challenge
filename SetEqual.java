/**
 * 3. Let us define two arrays as “set equal” if every element in one is also in
 * the other and vice-versa.
 * For example, any two of the following are equal to one another: {1, 9, 12},
 * {12, 1, 9}, {9, 1, 12, 1}, {1,
 * 9, 12, 9, 12, 1, 9}. Note that {1, 7, 8} is not set equal to {1, 7, 1} or {1,
 * 7, 6}.
 * Write a function named isSetEqual(int[ ] a, int[ ] b) that returns 1 if its
 * array arguments are set equal,
 * otherwise it returns 0.
 */
public class SetEqual {
    static int isSetEqual(int[] a, int[] b) {
        boolean exists;
        for (int i = 0; i < a.length; i++) {
            exists = false;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j])
                    exists = true;
            }
            if (!exists)
                return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isSetEqual(new int[] { 1, 9, 12 }, new int[] { 1, 9, 12, 9, 12, 1, 9 })); // 1
        System.out.println(isSetEqual(new int[] { 1, 7, 8 }, new int[] { 1, 7, 6 })); // 0
    }
}