// Kadane's algo:Maximum Subarray Sum in an Array, also printing the array

import java.util.*;

class KadanePrint{
    public static void main(String[] args) {
        int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
        int n = arr.length;
        
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int index= -1, end=-1;
        
        for(int i = 0; i<n ;i++){
            sum+=arr[i];
            if(sum>max){
                max = sum;
                end= i;
            }
            if (sum<0) {
                sum=0;
                index=i+1;
            }
        }
    
        
        System.out.println("Maximum subarray sum is: " + max);
        
        System.out.println("SubArray is:");
        for(int i = index; i<=end ;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
