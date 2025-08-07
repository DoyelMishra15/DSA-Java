
// Leaders in an array

import java.util.*;

class LeadersInAnArrayOpt
{
    public static void main(String[] args) 
  {
        
        int[] arr={10,22,12,3,0,6};
        int max = Integer.MIN_VALUE;
        ArrayList <Integer> res = new ArrayList<>();
        
        for(int i= arr.length-1;i>=0;i--)
        {
            if(arr[i]>max)
            {
                max= Math.max(max, arr[i]);
                res.add(arr[i]);
            }
        }
        
        
        for(int num:res)
        {
            System.out.print(num+" ");
        }
    }
}
