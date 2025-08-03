//Rearrange Array Elements by Sign
import java.util.*;

class RearrangeArray1 {
    public static void main(String[] args) {
        int[] arr = {1,2,-4,-5};
        int n = arr.length;
        int[] res = new int[n];

        int posI = 0, negI = 1;
        
        for(int i=0; i<n;i++){
            if(arr[i]>=0){ 
                res[posI] = arr[i];
                posI += 2;
            }
            else {
                res[negI] = arr[i];
                negI += 2;
            }
        }
        
        for(int i=0; i<n;i++){
            System.out.print(res[i]+" ");
        }
    }
}
