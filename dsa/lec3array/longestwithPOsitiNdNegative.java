package lec3;

import java.util.HashMap;
import java.util.Map;

public class longestwithPOsitiNdNegative {
    public static void main(String[] args) {
        int[] a = { -1, 1, 1};
        int k = 1;
        int n = a.length;

        Map<Integer, Integer> preSumMap = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];

            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            int rem = sum - k;

            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }
        System.out.println("\nThe length of the longest subarray is: " + maxLen+"\n");
    }
}
