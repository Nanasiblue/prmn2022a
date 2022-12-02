package exprogram;
import java.util.ArrayList;
import java.util.Random;
//import java.util.Collections;

public class Cipher {
    private String ptxt;
    private String japanese = "あいうえおかきくけこさしすせそなにぬねのはひふへほまみむめもやゆよらりるれろわをん";

    Cipher( String ptxt ) {
        this.ptxt = ptxt;
    }

    void Shuffle( int seed, int [] data ) {
        int n = data.length;
        Random rnd = new Random(seed);//任意のシードで固定する

        for ( int i = n - 1; i >= 1; i-- ) {//フィッシャーイェーツによるランダムならべかえ
            int j = rnd.nextInt(i);
            int tmp = data[i];
            data[i] = data[j];
            data[j] = tmp;
        }
    }

    public ArrayList<Integer> Encryption( int seed, String ptxt ) {
        ArrayList<Integer> Enc = new ArrayList<>();
        Random rand = new Random( seed );//シード固定で乱数を発生させる
        int [] data = new int[100000];//文字に置き換えるための数字の生成
        for ( int i = 0; i < 100000; i++ ) {
            data[i] = i;
        }
        this.Shuffle( seed, data );
        int [][] ramdom = new int[100][1000];//二次元配列への値の入れ直し
        int number = 0;
        for ( int i = 0; i < 100; i++ ) {
            for ( int j = 0; j < 1000; j++ ) {
                ramdom[i][j] = data[number];
                number++;
            }
        }
        for ( int i = 0; i < ptxt.length(); i++ ) {
            for ( int j = 0; i < japanese.length(); j++ ) {
                if ( ptxt.charAt(i) == japanese.charAt(j) ) {//一文字ずつ取り出して確認し、入力とひらがなが一致したときに乱数で決めた中から選んで暗号化
                    int r = rand.nextInt( 1000 );
                    Enc.add(ramdom[j][r]);
                }
            }
        }
        return Enc;
    }

    public ArrayList<Character> Decryption( int seed, String ctxt) {
        ArrayList<Character> Dec = new ArrayList<>();
        Random rand = new Random( seed );//シード固定で乱数を発生させる
        int [] data = new int[100000];//文字に置き換えるための数字の生成（復号なので対応表の作成）
        for ( int i = 0; i < 100000; i++ ) {
            data[i] = i;
        }
        this.Shuffle( seed, data );
        int [][] ramdom = new int[100][1000];
        int number = 0;
        for ( int i = 0; i < 100; i++ ) {
            for ( int j = 0; j < 1000; j++ ) {
                ramdom[i][j] = data[number];
                number++;
            }
        }
        String[] dtxt = ctxt.split(",");//入力された文字列を分割する
        for ( int i = 0; i < dtxt.length; i++ ) {//暗号化と逆の手順で一文字ずつ数字を文字に置き換える
            for ( int j = 0; j < 100; j++ ) {
                for ( int k = 0; k < 1000; k++ ) {
                    if ( Integer.parseInt(dtxt[j]) == ramdom[j][k] ) {//intにキャストして比較する
                        Dec.add(japanese.charAt(j));
                    }
                }
            }
        }
        return Dec;
    }

    public void setPtxt(String ptxt) {
        this.ptxt = ptxt;
    }
}
