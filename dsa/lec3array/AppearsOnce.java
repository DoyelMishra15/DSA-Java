package DSA.lec3array;

public class AppearsOnce {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,3,4,4,5};

        int n= 0;
        for(int i=0; i < nums.length; i++){
            int count = 0;
            n = nums[i];
            for(int j=0; j < nums.length; j++){
                if(n==nums[j]){
                    count+=1;
                }
            }
            if(count==1){
                break;
            }
        }
        System.out.println("\nThe number is: "+n+"\n");
    }
}
