public class ReverseInteger {
    public static int f(int n) {
        int reversedInteger = 0;
        while (n != 0) {
            reversedInteger = ((n % 10) + (reversedInteger * 10));
            n /= 10;
        }
        return reversedInteger;
    }

    public static void main(String[] args) {
        System.out.println(f(1234)); // 4321
        System.out.println(f(12005)); // 50021
        System.out.println(f(1)); // 1
        System.out.println(f(0)); // 0
        System.out.println(f(1000)); // 1
        System.out.println(f(-12345)); // -54321
    }
}