package DSA.lec3array;

public class Second_largest {
    public static void main(String[] args) {
        int[] arr = {3,4,62,4,6,7,3,45,22};

        int max = Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        int sec_max= Integer.MIN_VALUE;
        int sec_min= Integer.MAX_VALUE;
        for(int i = 0; i <= arr.length-1; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min>arr[i]){
                min = arr[i];
            }
        }

        for(int i = 0; i <= arr.length-1; i++){
            if(arr[i] > sec_max && arr[i] < max){
                sec_max = arr[i];
            }
            if(arr[i] < sec_min && arr[i] > min){
                sec_min = arr[i];
            }
        }

        System.out.println("second Max element is: "+ sec_max);
        System.out.println("second Min element is: "+ sec_min);
    }
}
