package Problem_Solving;

import java.util.Scanner;

public class Simple_array_sum {
    public static void main(String[] args){
        long sum = 0;
        Scanner input = new Scanner(System.in);
        long x = input.nextLong();
        long[] arr = new long[(int) x];
        for(int i=0; i<x; i++){
            arr[i]=input.nextLong();
        }
        for(int i = 0;i<x;i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
