import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int CUR_YEAR = 2022;
        System.out.print("\n  Provide Your Age :  ");
        int age = scan.nextInt();
        System.out.println("\n  Your Birth Year is :  " + (CUR_YEAR - age));
    }
}