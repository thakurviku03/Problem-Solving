package Problem_Solving;


import java.util.Scanner;

public class Birthday_cake_candles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int sum = 0;
        int[] arr = new int[x];
        for(int i = 0 ;i<x;i++){
            arr[i] = input.nextInt();
        }
        int max = 0;
        max = arr[0];
        for (int  i= 1; i < x; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < x; i++) {
            if (max == arr[i]) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
