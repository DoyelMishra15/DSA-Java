package DSA.lec3array;

public class leftRotate {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
        int n = arr.length;

        //for one place shift

        /*int temp = arr[0];

        for(int i = 0; i<n-1 ; i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }*/

        int x = 3;

        if(x>n){
            x=x%n;
        }

        int[] temp = new int[x];

        for(int i = 0; i < x; i++){
            temp[i] = arr[i];
        }

        for(int i = x; i < n; i++){
            arr[i-x] = arr[i];
        }

        for (int i = 0; i < x; i++) {
            arr[n - x + i] = temp[i];
        }
        
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
