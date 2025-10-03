import java.util.*;

public class LongestConsecutiveSequence_in_an_Array {
    public static void main(String[] args) {
        int[] a = {100, 200, 1, 3, 2, 4};
        int n = a.length;
        
        /*for(int i=0; i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if (a[j] < a[j+1]) {  
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
        }
        }}*/
      
        Arrays.sort(a);
        
        int lon=1;
        int lon_1=1;
        for(int i=0; i < n-1 ;i++){
            if(a[i] == a[i+1] -1){
                    lon++;
            }
            else {
                lon_1= Math.max(lon, lon_1);
                lon=0;
            }
        }
        System.out.println(lon_1);
    }
}
