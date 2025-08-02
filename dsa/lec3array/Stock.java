// Stock Buy And Sell

import java.util.*;
class Stock{
    public static void main(String[] args) {
        int[] arr= {7,1,5,3,6,4};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        int startDate = -1;
        for(int i = 0; i<n ;i++){
            if(min>arr[i]) {
                min = arr[i];
                startDate = i;
            }
        }
        for(int i = startDate; i<n ;i++){
            if(max<arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max-min);
    }
}
