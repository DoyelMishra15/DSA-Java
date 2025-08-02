 //Kadane's algo:Maximum Subarray Sum in an Array

import java.util.*;
class Kadane{
    public static void main(String[] args) {
        int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i<n ;i++){
            sum+=arr[i];
            max = Math.max(sum, max);
            if (sum<0) sum=0;
        }
        System.out.println("Maximum subarray sum is: " + max);
    }
}
