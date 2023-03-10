/*
 * Write a function named primeCount with signature
 * int primeCount(int start, int end);
 * The function returns the number of primes between start and end inclusive. Recall that a prime is
 * a positive integer greater than 1 whose only integer factors are 1 and itself.
 */
public class CountPrime {

    public static int primeCount(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            boolean flag = true;
            if (i <= 2) {
                continue;
            }
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(primeCount(10, 30)); // 6
        System.out.println(primeCount(11, 29)); // 6
        System.out.println(primeCount(20, 22)); // 0
        System.out.println(primeCount(1, 1)); // 0
        System.out.println(primeCount(5, 5)); // 1
        System.out.println(primeCount(6, 2)); // 0
        System.out.println(primeCount(-10, 6)); // 3
    }
}