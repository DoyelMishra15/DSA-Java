package DSA.lec3array;

public class AppearsOnce2 {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,3,4,4,5};
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length ; i++){
            if(nums[i]>max) max=nums[i];
        }
        int[] temp = new int[max+1];
        for(int i = 0; i<nums.length ; i++){
            temp[nums[i]] += 1;
        }
        for(int i = 0; i<temp.length ; i++){
            System.out.print(temp[i]+" ");
        }
        System.out.println();
        for(int i = 0; i<temp.length ; i++){
            if(temp[i]==1){
                System.out.println("The num is: "+ i);
            }
        }
    }
}
