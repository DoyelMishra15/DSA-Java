import java.util.HashMap;
import java.util.Map;

public class countfreq2 {
    public static void main(String args[]){  
        int arr[] ={10,5,10,15,10,5};
        int n = arr.length;
        countFreq1(arr, n);  
    }

    public static void countFreq1(int arr[],int n){
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i<n;i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i], mp.get(arr[i])+1);
            }
            else{
                mp.put(arr[i], 1);
            }
        }
        /*for(int i = 0; i<n;i++){
            System.out.println(arr[i]+ " "+mp.get(arr[i]));
        }*/
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
