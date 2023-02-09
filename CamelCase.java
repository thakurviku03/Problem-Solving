package Problem_Solving;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sen = in.nextLine();
        int x = sen.length();
        char[] arr = sen.toCharArray();
        int sum = 1;
        for (int i = 0; i < x; i++) {
            if (Character.isUpperCase(arr[i])) {
                sum++;
//                  System.out.println( arr[i]+"Character is in Uppercase.");
            } else {
//                    System.out.println( arr[i]+"Character is in Lowercase.");
            }

        }
        if(Character.isUpperCase(arr[0])){
            sum = sum -1;
        }
        System.out.println(sum);
    }
}
