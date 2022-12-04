package lecture06;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise6_2 {
    public static void main(String[] args) {
        try {
            ArrayList<Integer> list = new ArrayList<>();
            Random r = new Random();
            for ( int i = 0; i < 5; i++ ) {
                list.add(r.nextInt(6) + 1);
            }
            System.out.print("サイコロを5つ振りました\n何番目のサイコロの値を確認しますか？\n> ");
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            System.out.println(list.get(n));
        }
        catch (InputMismatchException n) {
            System.out.println("整数以外の値が入力されました\nプログラムを終了します");
        }
        catch (IndexOutOfBoundsException n) {
            System.out.println("ArrayListの範囲外アクセスを確認しました\nプログラムを終了します");
        }
        }

}
