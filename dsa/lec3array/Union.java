package DSA.lec3array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Union {
    public static void main(String[] args) {
        int[] a1={1,1,2,3,4,5};
    int[] a2={2,3,4,4,5};
    HashSet <Integer> st = new HashSet<>();

    for(int i=0; i<a1.length; i++){
        st.add(a1[i]);
    }
    for(int j = 0; j<a2.length; j++){
        st.add(a2[j]);
    }

    System.out.println(st);

    List<Integer> unionList = new ArrayList<>(st);
    Collections.sort(unionList);
    System.out.println("Sorted Union: " + unionList);
}

}
