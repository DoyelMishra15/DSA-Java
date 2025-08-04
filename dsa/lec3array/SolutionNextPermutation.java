//leetcode, helper array, next permutation

class Solution {
    public void nextPermutation(int[] arr) {
        int n = arr.length;
        //find the break point
        int brk1 = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                brk1 = i;
                break;
            }
        }

        if (brk1 == -1) {
            reverse(arr, 0, n - 1);
            return;
        } 
        else {
            for (int i = n - 1; i >= brk1; i--) {
                if (arr[brk1] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[brk1];
                    arr[brk1] = temp;
                    break;
                }
            }

            reverse(arr, brk1 + 1, n - 1);
        }
    }

    private void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
