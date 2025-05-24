package DSA.lec2;

public class selection {
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 42,9};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i = 0; i<arr.length; i++){
            int min = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int c = arr[min];
            arr[min] = arr[i];
            arr[i] = c;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}