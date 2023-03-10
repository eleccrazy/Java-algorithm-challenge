/**
 * 1. It is a fact that there exist two numbers x and y such that x! + y! = 10!.
 * Write a method
 * named solve10 that returns the values x and y in an array.
 * The notation n! is called n factorial and is equal to n * n-1 * n-2 * ... 2 *
 * 1, e.g., 5! = 5*4*3*2*1 = 120.
 * If you are programming in Java or C#, the function prototype is
 * int[ ] solve10() where the length of the returned array is 2.
 * If you are programming in C++ or C, the function prototype is
 * int * solve10() where the length of the returned array is 2.
 * Please be sure that the method solve10 returns an array, a, with two elements
 * where a[0] == x, a[1] == y and x! + y! = 10!.
 */

public class Solve10 {

    public static int[] solve10() {
        int a[] = new int[2];
        a[0] = 0;
        a[1] = 0;

        int fact10 = 1;

        for (int i = 10; i > 0; i--) {
            fact10 *= i;
        }

        for (int i = 1; i <= 10; i++) {
            int firstFact = 1;
            for (int j = 1; j > 0; j--) {
                firstFact *= j;
            }
            for (int k = 1; k <= 10; k++) {
                int secondFact = 1;
                for (int j = k; j > 0; j--) {
                    secondFact *= j;
                }

                if ((firstFact + secondFact) == fact10) {
                    a[0] = i;
                    a[1] = k;
                }
            }
        }
        return a;

    }

    public static void main(String[] args) {
        // Infact, there is no solition for x & y such that x! + y! = 10!.
        int arr[] = solve10();
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}