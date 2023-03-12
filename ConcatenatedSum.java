public class ConcatenatedSum {

    public static int checkConcatenatedSum(int n, int catlen) {
        int base = 10, multiplier = 0, nCache = n;
        int sum = 0, digit;
        for (int i = 1; i < catlen; i++) {
            multiplier += base;
            base *= 10;
        }
        multiplier += 1;
        while (nCache != 0) {
            digit = nCache % 10;
            sum += (digit * multiplier);
            nCache /= 10;
        }
        if (sum == n) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(checkConcatenatedSum(198, 2)); // return 1
        System.out.println(checkConcatenatedSum(198, 3)); // return 0
        System.out.println(checkConcatenatedSum(2997, 3)); // return 1
        System.out.println(checkConcatenatedSum(2997, 2)); // return 0
        System.out.println(checkConcatenatedSum(13332, 4)); // return 1
        System.out.println(checkConcatenatedSum(9, 1)); // return 1
    }
}