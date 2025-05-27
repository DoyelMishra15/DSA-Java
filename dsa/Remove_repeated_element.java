package DSA.lec3array;

import java.util.HashSet;

public class Remove_repeated_element {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3,3};

        HashSet<Integer> st = new HashSet<>();
        for(int i = 0; i < arr.length ; i++){
            st.add(arr[i]);
        }

        int k = st.size();
        int j=0;
        for(int x: st){
            arr[j]=x;
            j++;
        }

        System.out.println();
        System.out.println("Unique elements are: "+ k);
        System.out.println("Array after removing duplicates");

        for(int i = 0; i < k ; i++){
            System.out.print(arr[i]+" ");
        } 
    }
}
