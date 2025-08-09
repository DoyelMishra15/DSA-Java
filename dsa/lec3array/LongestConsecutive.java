// Longest Consecutive Sequence in an Array

import java.util.*;

class LongestConsecutive {
  
    public static void main(String[] args) 
  {
        int[] arr={100, 200, 1, 3, 2, 4};
        int n = arr.length;
        int count = 1, long1=1;
        int x;
        
        for(int i=0;i<n;i++){
            count=1;
            x=arr[i];
            while(longest(arr,n,x+1)){
                count++;
                long1=Math.max(long1, count);
                x++;
            }
        }
        
        System.out.println(long1);
    }
    
    public static boolean longest(int[] arr, int n, int num)
  {
        for(int i=0;i<n;i++){
            if(arr[i]==num){
                return true;
            }
        }
        return false;
    }
}
