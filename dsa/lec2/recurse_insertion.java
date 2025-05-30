package DSA.lec2;

public class recurse_insertion {
    static void rec_insertion(int[] arr,int n, int i){
        if (i==n) return;
        int j = i;
        while(j>0 && arr[j-1]>arr[j]){
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
            j--;
        }
        rec_insertion(arr, n, i + 1);
    }
    public static void main(String[] args) {
        int[] arr ={13,46,24,52,20,9};
        int n = arr.length;
        rec_insertion(arr,n, 0);
        System.out.println("After insertion sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
