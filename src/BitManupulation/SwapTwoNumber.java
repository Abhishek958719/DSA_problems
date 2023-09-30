package BitManupulation;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String []argv){
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("a = " + a + " b = " + b);
    }
}
