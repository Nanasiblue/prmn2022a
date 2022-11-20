package exprogram;
import java.util.ArrayList;

public class Sosuu {
    int number;

    Sosuu(int number) {
        this.number = number;
    }

    ArrayList<Integer> calc ( int number ) {
        ArrayList<Integer> sosuu = new ArrayList<>();
        sosuu.add( 2 );
        for( int i = 3; i <= number; i += 2 ) { //調べる数を奇数に限定する
            int k = 0;
            for(int j = 3; j <= Math.sqrt ( i ); j += 2 ) { //2以降の素数はすべて奇数であるため、割る数を奇数に限定する
                if( i % j == 0 ) {
                    k = 1;
                    break; //一つでも割り切れる数字があれば合成数なので処理を打ち切る
                }
            }
            if ( k == 0 ) {
                sosuu.add( i ); //k == 0のとき探索できるすべての数で割り切れないためiは素数である よってsosuu配列に追加する
            }
        }
        return (sosuu);
    }

    void print ( ArrayList<Integer> sosuu ) {
        System.out.print( sosuu );
    }
}

