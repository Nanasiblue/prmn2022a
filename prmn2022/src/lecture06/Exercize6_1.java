package lecture06;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercize6_1 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("小数値を入力してください:\n> ");
            float f = input.nextFloat();
            System.out.println(f);
        }
        catch (InputMismatchException f) {
            System.out.println("Error");
        }
    }
}
