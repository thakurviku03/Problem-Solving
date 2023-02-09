package Problem_Solving;

import java.util.Scanner;


// not readable
public class Currency_Convertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        char a = '$';
        char b = '￥';
        char c = '€';
        scanner.close();
        System.out.println("US: " + a+String.format("%.2f", payment));
        System.out.println("india: " + "Rs."+String.format("%.2f",payment));
        System.out.println("china: " +b +String.format("%.2f",payment));
        System.out.println("france: " + String.format("%.2f",payment)+c);

    }
}
