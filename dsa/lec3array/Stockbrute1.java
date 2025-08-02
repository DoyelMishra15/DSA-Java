// Stock Buy And Sell

import java.util.*;
class Stockbrute1{
    public static void main(String[] args) {
        int[] arr= {7,1,5,3,6,4};
        int n = arr.length;
        int maxprof= 0;
        int min=arr[0];
        int cost=0;
        for(int i = 1; i<n ;i++){
            cost = arr[i]-min;
            maxprof= Math.max(cost, maxprof);
            min = Math.min(arr[i],min);
        }
        System.out.println(maxprof);
    }
}
