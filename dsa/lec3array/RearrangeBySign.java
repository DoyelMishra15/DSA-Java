//Rearrange Array Elements by Sign

class RearrangeBySign {
    public static void main(String[] args) {
       int[] arr={1,2,-3,-1,-2,-3};
       int n = arr.length;
       int countP=0,countN=0;
       
       for(int num : arr){
           if(num>=0) countP++;
           else countN++;
       }
       
       int[] pos = new int[countP];
       int[] neg = new int[countN];
       int x=0, y=0;
       for(int num : arr){
           if(num>=0) pos[x++]= num;
           else neg[y++] = num;
       }
       
       x=0; y=0;
       
       int i = 0;
       
       while(x < countP && y < countN){
         if(i%2==0) arr[i++]= pos[x++];
         else arr[i++]=neg[y++];
       }
       while(x < countP){
           arr[i++]=pos[x++];
       }
       while(y < countN){
           arr[i++]=neg[y++];
       }
       
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
