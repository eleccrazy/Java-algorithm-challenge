/**
 * Question 3. A normal number is defined to be one that has no odd factors,
 * except for 1 and possibly itself.
 * Write a method named isNormal that returns 1 if its integer argument is
 * normal, otherwise it returns 0. The
 * function signature is
 * int isNormal(int n)
 * Examples: 1, 2, 3, 4, 5, 7, 8 are normal numbers. 6 and 9 are not normal
 * numbers since 3 is an odd factor. 10 is
 * not a normal number since 5 is an odd factor.
 */
public class NormalNumber {
    static int isNormal(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0 && i % 2 != 0)
                return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isNormal(1)); // 1
        System.out.println(isNormal(2)); // 1
        System.out.println(isNormal(4)); // 1
        System.out.println(isNormal(8)); // 1
        System.out.println(isNormal(3)); // 1
        System.out.println(isNormal(5)); // 1
        System.out.println(isNormal(7)); // 1
        System.out.println(isNormal(6)); // 0
        System.out.println(isNormal(9)); // 0
        System.out.println(isNormal(12)); // 0
        System.out.println(isNormal(10)); // 0
    }
}