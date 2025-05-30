package DSA.lec2;

public class bubble {
    public static void main(String[] args) {

        int[] arr ={13,46,24,52,20,9};

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j< arr.length - i - 1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
