public class Recursion7 {
    static void reverse(int[] arr){
        int[] arr2 = new int[arr.length];
        int x = 0;
        for(int i = arr.length-1; i>=0 ; i--){
            arr2[x] = arr[i];
            x++;
        }
        for (int y : arr2) {
            System.out.print(y+" ");
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        reverse(arr);
    }
}
