//Sort an array of 0s, 1s and 2s

import java.util.Scanner;

class Sort012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        System.out.println("Enter the elements");
        for(int i = 0; i<n ; i++){
            num[i] = sc.nextInt();
        }
        Sorting012(num, n);
        System.out.println("After sorting");
        for(int i = 0; i<n ; i++){
            System.out.print(num[i]+" ");
        }
    }
    public static int[] Sorting012(int[] num, int n){
        int count0=0, count1=0,count2=0;
        for(int i = 0; i<n ; i++){
            if(num[i]==0) count0++;
            else if(num[i]==1) count1++;
            else count2++;
        }
        int j =0;
        while(j<count0){
            num[j]=0;
            j++;
        }
        while(j<count0+count1){
            num[j]=1;
            j++;
        }
        while(j<count0+count1+count2){
            num[j]=2;
            j++;
        }
        return num;
    }
}
