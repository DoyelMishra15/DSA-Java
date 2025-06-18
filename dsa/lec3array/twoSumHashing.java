package lec3;

import java.util.HashMap;

public class twoSumHashing {
    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int moreNeeded = target - num;
            if (mp.containsKey(moreNeeded)) {
                System.out.println("YES");
                return;
            }
            mp.put(num, i);
        }
        System.out.println("NO");
    }
}