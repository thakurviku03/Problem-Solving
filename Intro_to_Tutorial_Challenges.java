package Problem_Solving;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Intro_to_Tutorial_Challenges {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]= in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i]==v){
                System.out.println(i);
            }
        }
    }
}
