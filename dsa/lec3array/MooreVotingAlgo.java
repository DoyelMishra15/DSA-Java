//Moore’s Voting Algorithm:

import java.util.*;

class MooreVotingAlgo {
    public static void main(String[] args) {
        int[] num = {2, 2, 1, 1, 1, 2, 2};
        int n = num.length;
        int count=0;
        int ele=0;
        for(int i = 0 ; i < n ; i++){
            if(count==0){
                ele = num[i];
            }
            else if(num[i]==ele){
                count++;
            }
            else{
                count--;
            }
        }
        System.out.print(ele);
    }
}
