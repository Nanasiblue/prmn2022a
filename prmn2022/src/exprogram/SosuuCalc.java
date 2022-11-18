package exprogram;
import java.util.ArrayList;
import java.util.Scanner;

public class SosuuCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        System.out.print( "整数を入力:\n> " ); //素数を求めたい地点までの任意の整数を入力する
        int n = input.nextInt();
        Sosuu s = new Sosuu( n );
        ArrayList<Integer> sosuu = s.calc( n );
        s.print( sosuu );
    }
}
