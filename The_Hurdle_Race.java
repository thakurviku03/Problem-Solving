package Problem_Solving;

import java.util.Scanner;

public class The_Hurdle_Race {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int max =arr[0];
        for (int i = 0; i < n; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }
        if (max>k){
            int diff = max-k;
            System.out.println(diff);
        }else{
            System.out.println("0");
        }

    }
}
