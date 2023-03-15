public class CompleteEven {
    static int isComplete(int[] a) {
        int len = a.length;
        int maxEven = 0;
        for (int i = 0; i < len; i++) {
            if (a[i] <= 0)
                return 0;
            if (a[i] % 2 == 0 && a[i] > maxEven)
                maxEven = a[i];
        }
        boolean exists;
        for (int i = 2; i < maxEven; i += 2) {
            exists = false;
            for (int j = 0; j < len; j++) {
                if (a[j] == i)
                    exists = true;
            }
            if (!exists)
                return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isComplete(new int[] { 2, 3, 2, 4, 11, 6, 10, 9, 8 })); // 1
        System.out.println(isComplete(new int[] { 2, 3, 3, 6 })); // 0
        System.out.println(isComplete(new int[] { 2, -3, 4, 3, 6 })); // 0
    }
}