package lec3;

public class twoSum {
    public static void main(String[] args) {
        int[] nums = {2, 6, 5, 8, 11};
        int target = 14;
        for(int i=0; i< nums.length ; i++){
            for(int j=i+1; j< nums.length ; j++){
                if(nums[i]+nums[j]==target){
                    System.out.println("yes");
                    break;
                }
            }
        }
    }
}
