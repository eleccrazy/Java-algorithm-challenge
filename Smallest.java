/**
 * 1. The number 124 has the property that it is the smallest number whose first
 * three multiples contain the digit 2. Observe that
 * 124*1 = 124, 124*2 = 248, 124*3 = 372 and that 124, 248 and 372 each contain
 * the digit 2. It is possible to generalize this property to be the
 * smallest number whose first n multiples each contain the digit 2. Write a
 * function named smallest(n) that returns the smallest number whose firs
 * n multiples contain the digit 2. Hint: use modulo base 10 arithmetic to
 * examine digits.
 * Its signature is
 * int smallest(int n)
 * You may assume that such a number is computable on a 32 bit machine, i.e, you
 * do not have to detect integer overflow in your answer.
 */

public class Smallest {
    public static int smallest(int n) {
        int product = 0, count;
        boolean flag;
        for (int i = 2; true; i++) {
            count = 0;
            for (int j = 1; j <= n; j++) {
                product = i * j;
                flag = false;
                while (product != 0) {
                    if (product % 10 == 2) {
                        flag = true;
                        break;
                    }
                    product /= 10;
                }
                if (!flag) {
                    break;
                } else {
                    count++;
                }
            }
            if (n == count) {
                return i;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(smallest(3));
        System.out.println(smallest(4));
        System.out.println(smallest(5));
        System.out.println(smallest(6));
        System.out.println(smallest(7));
    }
}