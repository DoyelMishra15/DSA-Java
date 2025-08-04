//Next permutation

import java.util.Arrays;

class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 4, 3, 0, 0};
        //longer prefix match
        int n = arr.length;
        //find the break point
        int brk1 = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                brk1 = i;
                //System.out.println(brk1);
                break;
            }
        }

        if (brk1 == -1) {
            for (int i = n - 1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            return;
        } else {
            for (int i = n - 1; i >= brk1; i--) {
                if (arr[brk1] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[brk1];
                    arr[brk1] = temp;
                    break;
                }
            }

            int left = brk1 + 1, right = n - 1;
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
