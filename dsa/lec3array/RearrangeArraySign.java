//Rearrange Array Elements by Sign
import java.util.*;

class RearrangeArraySign {
    public static void main(String[] args) {
        int[] arr = {1,2,-4,-5};
        int n = arr.length/2;
        int[] pos = new int[n];
        int[] neg = new int[n];

        int x = 0, y = 0;
        
        for(int i=0; i<2*n;i++){
            if(arr[i]>=0) pos[x++] = arr[i];
            else neg[y++] = arr[i];
        }
        
        x=0;
        y=0;
        
        for(int i=0; i<2*n;i++){
            if(i%2==0) arr[i] = pos[x++];
            else arr[i] = neg[y++];
        }
        
        for(int i=0; i<2*n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
