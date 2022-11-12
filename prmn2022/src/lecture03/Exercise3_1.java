package lecture03;

import java.util.Scanner;

public class Exercise3_1 {
    public static void main(String[] args) {
        main();
    }
    static void main(){
        Scanner input = new Scanner(System.in);
        System.out.print( "任意の文字列を入力してください：\n> " );
        String x = input.next();
        System.out.println( x + " と入力されました" );
    }
}
