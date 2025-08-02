// Maximum Subarray Sum in an Array

import java.util.*;
class SubarraySum{
    public static void main(String[] args) {
        int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i<n ;i++){
            int sum = 0;
            for(int j = i; j<n ;j++){
                sum+=arr[j];
                max = Math.max(sum, max);
            }
        }
        System.out.println("Maximum subarray sum is: " + max);
    }
}
