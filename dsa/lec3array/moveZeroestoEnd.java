package DSA.lec3array;

public class moveZeroestoEnd {
    public static void main(String[] args) {
        int[] arr ={1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};

        int k = 0;

        for(int i =0; i<arr.length;i++){
            if(arr[i]!=0){
                k=k+1;
            }
        }

        int j = 0;

        int[] temp = new int[k];
        for(int i = 0; i < arr.length ; i++){
            if(arr[i]!=0){
                temp[j++] = arr[i];
            }
        }

        for(int i = 0; i < k ; i++){
            arr[i] = temp[i];
        }
        for(int i = k; i < arr.length ; i++){
            arr[i]= 0;
        }

        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
