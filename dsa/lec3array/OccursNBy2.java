// Find the Majority Element that occurs more than N/2 times

//brute force

class OccursNBy2 {
    public static void main(String[] args) {
        int[] num = {2,2,1,1,1,2,2};
        int threshold = num.length / 2;
        for(int i = 0; i < num.length ; i++){
            int count=0;
            for(int j = 0; j < num.length ; j++){
                if(num[i]==num[j]) count++;
            }
            if(count> threshold){
                System.out.println(num[i]);
                break;
            }
        }
    }
}
