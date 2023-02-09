package Problem_Solving;


import java.util.Scanner;

public class Mini_max {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            long sum = 0;
            long[] arr = new long[5];
            //input of array
            for (int i = 0; i < 5; i++) {
                arr[i] = input.nextLong();
            }
            //sum of full array
            for (int i = 0; i < 5; i++) {
                sum = sum + arr[i];
            }
            //intializing max
            long max=0 ;
            max = arr[0];
            //intialising min
            long min = 0;
            min = arr[4];
            //loop to find max and min
            for (int i = 0; i < 5; i++) {
                if (max < arr[i]) {
                     max =arr[i] ;
                }
            }
            for (int i = 0; i < 5; i++) {
                if (min > arr[i]) {
                    min = arr[i]  ;
                }
            }
        long maxx = sum - min;
        long minn = sum - max;
        System.out.print(minn + " " + maxx);
    }
}
