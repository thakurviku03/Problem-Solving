package Problem_Solving;

import java.util.Scanner;

public class Staircase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        for(int i = 0; i < n; i++) {

            for (int j=a ;j<n-1;j++){
                System.out.print(" ");
            }
            for(int k = 0;  k<=i; k++) {
                System.out.print("#");
            }
            System.out.println();
            ;
            a++;
        }
    }
}
