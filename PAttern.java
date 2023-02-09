package Problem_Solving;

import java.util.Scanner;

public class PAttern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 3;
        for (int i = 1; i <= x; i++) {
            int n =1;
            for (int j = 0;j<=n ;n++) {
                if (x >= n) {
                    System.out.print("#");
                }
            }
            System.out.println();
            x=3;

        }

    }
}
