import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FactorFinder {

    public static int findPthFactor(int n, int p) {
        List<Integer> factors = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors.add(i);
            }
        }

        Collections.sort(factors);

        if (p <= factors.size()) {
            return factors.get(p - 1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int n = 20;
        int p = 3;
        int result = findPthFactor(n, p);
        System.out.println(result);
    }
}