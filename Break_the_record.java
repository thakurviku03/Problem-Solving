package Problem_Solving;

import java.util.Scanner;

public class Break_the_record {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int  high=0,low=0,max=0, min =0;
        int[] arr = new int[x];
        for(int i = 0; i<x;i++){
            arr[i] = input.nextInt();
        }
        max = arr[0];
        min = arr[0];
        for(int i = 1;i<x;i++){
            if(max<arr[i]){
                max = arr[i];
                high++;
            }else if (min>arr[i]) {
                min = arr[i];
                low++;
            }
        }
        System.out.print(high + " " + low);
    }
}
