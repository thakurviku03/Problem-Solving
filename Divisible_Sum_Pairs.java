package Problem_Solving;

import java.util.Scanner;

public class Divisible_Sum_Pairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[]arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int sum =0 ;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i]+arr[j]==k){
                    if(arr[i]!=arr[j]){
                        sum++;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
