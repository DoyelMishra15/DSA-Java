package DSA.lec2;

public class recurse_bubble {

    static void rec_bubble(int[] arr,int n){
        if (n==1) return;
        for(int j = 0; j< n - 1; j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        rec_bubble(arr, n-1);
    }
    public static void main(String[] args) {
        int[] arr ={13,46,24,52,20,9};
        int n = arr.length;
        rec_bubble(arr,n);
        System.out.println("After bubble sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
