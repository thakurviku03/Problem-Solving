package Problem_Solving;

import java.util.Scanner;

public class Bill_Division {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if(i!=k){
                sum =sum+arr[i];
            }
        }
        int charged = in.nextInt();
        int acutalbill = sum/2;
        int overpaid = charged -acutalbill ;
        if(overpaid!=0){
            System.out.println(overpaid);
        }else{
            System.out.println("Bon Appetit");
        }
    }
}
