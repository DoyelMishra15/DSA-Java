package DSA.lec3array;

public class SortedOrNot {

    static boolean sorted(int[] arr){
        boolean increase = true;
        boolean decrease = true;
        for(int i=0; i<arr.length-1 ; i++){
            if(arr[i]<arr[i+1]){
                decrease = false;
            }
            if(arr[i]>arr[i+1]){
                increase = false;
            }
        }
        return increase||decrease;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        boolean result= sorted(arr);
        System.out.println(result);
    }
}
