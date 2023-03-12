public class GetExponent {

    public static int getExponent(int n, int p) {
        int res = 0, x = 0, number = Math.abs(n);

        if (p <= 1) {
            return -1;
        }

        for (int i = 0; res < number; i++) {
            res = (int) Math.pow(p, i);
            if (n % res == 0) {
                x = i;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(getExponent(162, 3)); // returns 4
        System.out.println(getExponent(27, 3)); // returns 3
        System.out.println(getExponent(28, 3)); // returns 0
        System.out.println(getExponent(280, 7)); // returns 1
        System.out.println(getExponent(-250, 5)); // returns 3
        System.out.println(getExponent(18, 1)); // returns -1
        System.out.println(getExponent(128, 4)); // returns 3
    }
}