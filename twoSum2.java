package lec3;

import java.util.ArrayList;

public class twoSum2 {
    public static void main(String[] args) {
        int[] nums = {2, 6, 5, 8, 11};
        ArrayList <Integer> l = new ArrayList<>();
        int target = 14;
        boolean flag = false;
        for(int i=0; i< nums.length ; i++){
            for(int j=i+1; j< nums.length ; j++){
                if(nums[i]+nums[j]==target){
                    l.add(i);
                    l.add(j);
                    flag= true;
                    break;
                }
            }
            if(flag==true){
                break;
            }
        }
        System.out.println(l);
    }
}