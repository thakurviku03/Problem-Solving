package Problem_Solving;

import java.util.Scanner;

public class Lisa_Workbook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
                 arr[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]%3==0){
                int page = arr[i]/3;
                sum= sum +page;
            }
            if(arr[i]%3!=0){
                double page = (double)arr[i]/3;
                sum = sum ;
            }
        }
    }

}
