package Problem_Solving;

import java.math.BigInteger;
import java.util.Scanner;

public class Extra_Long_Factorials {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger a = BigInteger.valueOf(1);
        for(int i = 1 ;i <=n;i++){
            BigInteger num = BigInteger.valueOf(i);
            a = a.multiply(num);
        }
        System.out.println(a);
    }
}
