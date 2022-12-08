package exprogram;
import java.util.Scanner;
import java.util.ArrayList;

public class CipherX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Encryption -> e, Decryption -> d, Exit -> 0\n> ");
        String a;
        while (true) {
            a = input.next();
            if ( a.equals("e") || a.equals("d") || a.equals("0")) {//期待する文字なら無限ループを抜ける
                break;
            }
            else {
                System.out.println("Error, enter again.");
                System.out.print("Encryption -> e, Decryption -> d, Exit -> 0\n>");//入力が違う時は再入力
                a = input.next();
            }
        }
        if (a.equals("e")) {            //暗号化
            System.out.print("Key\n>");//シードを固定するため任意の値を入れて固定
            int key = input.nextInt();
            System.out.print("Text\n>");//平文の入力
            String ptxt = input.next();
            Cipher cipher = new Cipher(ptxt);
            cipher.setPtxt(ptxt);//平文の受け渡し
            ArrayList<Integer> Enc;
            Enc = cipher.Encryption(key, ptxt);//処理結果の受け渡し
            View view = new View(Enc);
            view.view(Enc);//表示
        }

        if (a.equals("d")) {            //復号
            System.out.print("Key\n>");//シードを固定するため任意の値を入れて固定
            int key = input.nextInt();
            System.out.print("Text(Cipher)\n>");//暗号文の数字をカンマ区切りで入力
            String ctxt = input.next();
            Cipher cipher = new Cipher(ctxt);
            cipher.setPtxt(ctxt);//暗号文の受け渡し
            ArrayList<Character> Dec;
            Dec = cipher.Decryption(key, ctxt);//処理結果の受け渡し
            ViewD viewD = new ViewD(Dec);
            viewD.view(Dec); //表示
        }

        if (a.equals("0")) {
            System.exit(0);
        }
    }
}
