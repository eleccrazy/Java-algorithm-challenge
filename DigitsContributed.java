
/**
 * The depth of an integer is defined to be how may mutliplies of n it is necessary
 * to compute before all 10 digits have appeared at least once in some multiple.
 * For example, the depth of 42 is 9.
 */
import java.util.ArrayList;

public class DigitsContributed {
    public static int computeDepth(int n) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        int depth = 0;
        int numberCache;
        int check;
        int base;
        int idxCount = 0;
        boolean flag;
        for (int i = 1; true; i++) {
            base = n * i;
            depth++;
            numberCache = base; // 14
            while (numberCache != 0) {
                check = numberCache % 10;
                flag = true;
                if (a.size() == 0) {
                    a.add(check);
                    idxCount++;
                }
                for (int k = 0; k < idxCount; k++) {
                    if (check == a.get(k)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    a.add(check);
                    idxCount++;
                }
                numberCache /= 10;
            }
            if (a.size() == 10) {
                break;
            }
        }
        return depth;
    }

    public static void main(String[] args) {
        System.out.println(computeDepth(42));
        System.out.println(computeDepth(7));
        System.out.println(computeDepth(13));
        System.out.println(computeDepth(25));
    }
}