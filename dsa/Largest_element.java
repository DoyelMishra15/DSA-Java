package DSA.lec3array;

public class Largest_element {
    public static void main(String[] args) {
        int[] arr = {3,4,62,4,6,7,3,45,22};
        int max = arr[0];
        for(int i = 0; i <= arr.length-1; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Max element is: "+max);
    }
}
