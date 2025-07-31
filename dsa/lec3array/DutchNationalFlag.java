//0,1,2 array sorting, using Dutch National Flag Algorithm
class DutchNationalFlag {
    public static int[] Dutch_national_flag(int[] arr, int n){
        int low = 0, mid=0, high=n-1;
        int temp;
        while(mid <= high){
            if (arr[mid]==0){
                temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,0,0,1,2,0,2};
        int n = arr.length;
        Dutch_national_flag(arr, n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
