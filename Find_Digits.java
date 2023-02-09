package Problem_Solving;

import java.util.Arrays;
import java.util.Scanner;

public class Find_Digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        while (x > 0) {
            int n = in.nextInt();
            String temp = Integer.toString(n);
            int[] arr = new int[temp.length()];

            for (int i = 0; i < temp.length(); i++) {
                arr[i] = Character.getNumericValue(temp.charAt(i));
            }

            int sum1 = 0;
            for (int i = 0; i < temp.length(); i++) {
                if (arr[i] != 0) {
                    boolean isDivisible = n % arr[i] == 0;
                    if (isDivisible) {
                        sum1++;
                    }
                }
            } x--;
            System.out.println(sum1);
        }
    }
}
