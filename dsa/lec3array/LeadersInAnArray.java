// Online Java Compiler
// Leaders in an array

import java.util.*;

class LeadersInAnArray{
    public static void main(String[] args) {
        
        int[] arr={10,22,12,3,0,6};
        int flag =0;
        ArrayList <Integer> res = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                  flag=1;  
                }
                else {
                    flag=-1;
                    break;
                }
            }
            if (flag==1) res.add(arr[i]);
        }
        
        res.add(arr[arr.length-1]);
        
        for(int num:res){
            System.out.print(num+" ");
        }
    }
}
