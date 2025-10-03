import java.util.*;

public class LongestConsecutiveSequence_in_an_Array_1 {
    public static void main(String[] args) {
        int[] a = {3, 8, 5, 7, 6};
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
            else if (a[i] != a[i + 1]) {
                lon_1= Math.max(lon, lon_1);
                lon=1;
            }
        }
        lon_1 = Math.max(lon, lon_1);
        System.out.println(lon_1);
    }
}
