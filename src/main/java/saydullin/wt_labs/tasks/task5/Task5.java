package saydullin.wt_labs.tasks.task5;

import java.util.ArrayList;
import java.util.Arrays;

public class Task5 {
    private int[] a;

    Task5(int[] a) {
        this.a = a;
    }

    public int execute() {
        ArrayList<Integer> res = new ArrayList<>();

        int n = a.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] > a[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int maxLen = Arrays.stream(dp).max().orElse(0);
        return n - maxLen;
    }

}
