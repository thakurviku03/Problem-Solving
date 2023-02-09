package Problem_Solving;

import java.util.Scanner;

public class Number_Line_Jumps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int v1 = in.nextInt();
        int y = in.nextInt();
        int v2 = in.nextInt();
        while(v2<v1){
            System.out.println("yes");
        }
        System.out.println("no");
    }
}
