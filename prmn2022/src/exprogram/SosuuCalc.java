package exprogram;
import java.util.ArrayList;
import java.util.Scanner;

public class SosuuCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print( "整数を入力:\n> " );
        int n = input.nextInt();
        Sosuu s = new Sosuu( n );
        ArrayList<Integer> sosuu = s.calc( n );
        s.print( sosuu );
    }
}
