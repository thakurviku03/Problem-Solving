package Problem_Solving;

import java.util.Scanner;

public class A_very_Big_Sum {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        long a = input.nextLong();
        long sum = 0;
        long[] arr = new long[(int) a];
        while(input.hasNextInt()){
            for(int i=0; i<a; i++){
                arr[i]=input.nextLong();
            }
            for(int x=0;x<a;x++){
                sum = sum + arr[x];
            }
            System.out.println(sum);
        }
    }
}
