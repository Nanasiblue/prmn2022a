package lecture03;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise3_2 {
    public static void main(String[] args) {
    main();
    }
    static void main(){
        Scanner input = new Scanner(System.in);
        ArrayList<String> text = new ArrayList<>();
        System.out.print("何行分入力しますか？\n> ");
        int i = input.nextInt();
        for(int j = 0; j < i; j++){
            System.out.print(j + 1 + "行目:\n> ");
            String x = input.next();
            text.add(x);
        }
        System.out.println("入力した文字列:");
        int y = 0;
        for(String s : text){
            System.out.println("[" + y + "]" + " " + s);
            y++;
        }
    }
}
