package lecture03;

import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {
    main();
    }
    static void main(){
        Scanner input = new Scanner(System.in);
        System.out.print("１つ目の整数を入力してください:\n> ");
        String x = input.next();
        System.out.print("２つ目の整数を入力してください:\n> ");
        String y = input.next();
        int xn = Integer.parseInt(x);
        int yn = Integer.parseInt(y);
        int sum = xn + yn;
        System.out.println(xn + " + " + yn + " = " + sum);
    }
}
