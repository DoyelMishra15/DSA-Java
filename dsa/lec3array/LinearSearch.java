package DSA.lec3array;

public class LinearSearch {
    public static void main(String[] args) {

        int[] arr ={1 ,2 ,3 ,4 ,5};

        int num = 6;
        int index = -1;

        for(int i = 0; i < arr.length ; i++){
            if(num == arr[i]){
                index = i;
            }
        }

        System.out.println("Found at position: " + index);
    }
}
