//stock buy and sell, optimized

import java.util.*;

class StockOpt
{
    public static void main(String[] args) 
  {
        int[] arr ={7,6,5,4,3,2,1};
        int minPrice = Integer.MAX_VALUE;
        int maxpro=0;
    
        for(int i = 0; i<arr.length;i++)
        {
            if (minPrice>arr[i]) minPrice=arr[i];
            maxpro = Math.max(maxpro, arr[i]-minPrice);
        }
    
        System.out.println(maxpro);
    }
}
