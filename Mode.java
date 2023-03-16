/**
 * 1. Mode is the most frequently appearing value. Write a function named
 * hasSingleMode that takes an array
 * argument and returns 1 if the mode value in its array argument occurs exactly
 * once in the array, otherwise it
 * returns 0. If you are writing in Java or C#, the function signature is
 * int hasSingleMode(int[ ] ).
 * If you are writing in C or C++, the function signature is
 * int hasSingleMode(int a[ ], int len)
 * where len is the length of a.
 */
public class Mode {
    static int hasSingleMode(int[] a) {
        int len = a.length;
        int max_count = 0;
        int caheMax = 0;
        int modeCount = 0;
        for (int i = 0; i < len; i++) {
            max_count = 0;
            for (int j = i; j < len; j++) {
                if (a[i] == a[j])
                    max_count++;
            }
            if (max_count > caheMax)
                caheMax = max_count;
        }
        int count;
        for (int i = 0; i < len; i++) {
            count = 0;
            for (int j = i; j < len; j++) {
                if (a[i] == a[j])
                    count++;
            }
            if (count == caheMax)
                modeCount++;
        }
        if (modeCount != 1)
            return 0;
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(hasSingleMode(new int[] { 1, -29, 8, 5, -29, 6 })); // 1
        System.out.println(hasSingleMode(new int[] { 1, 2, 3, 4, 2, 4, 7 })); // 0
        System.out.println(hasSingleMode(new int[] { 1, 2, 3, 4, 6 })); // 0
        System.out.println(hasSingleMode(new int[] { 7, 1, 2, 1, 7, 4, 2, 7, })); // 1
    }
}