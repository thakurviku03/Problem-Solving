package Problem_Solving;

import java.util.Scanner;

public class Plus_minus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int suma=0,sumb=0,sumc=0,x;
        x = input.nextInt();
        int[] arr = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = input.nextInt();
        }
        for(int i=0;i<x;i++){
            if(arr[i]>0){
                suma++;
            }
            else if (arr[i]==0) {
                sumc++;
            }
            else if (arr[i]<0){
                sumb++;
            }
        }
        double z = (double)(x);
        double a = (suma)/z;
        double b = sumb/z;
        double c = sumc/z;
        System.out.println(
                String.format("%.6f", a));
        System.out.println(
                String.format("%.6f", b));
        System.out.println(
                String.format("%.6f", c));
    }
}
