package DSA.lec3array;

public class longest_subarray {

    //Brute Force
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        long k = 10;
        int len = 0;
        for(int i = 0 ; i < a.length; i++){
            int s = 0;
            for (int j = i; j < a.length; j++) {
                s += a[j];
                if (s == k) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        System.out.println(len);
    }
}
