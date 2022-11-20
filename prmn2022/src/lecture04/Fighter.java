package lecture04;
import java.util.Scanner;

public class Fighter {
    int hitPoint;
    int power;
    String name;

    Fighter( int power, String name ) {
        this.hitPoint = hitPoint;
        this.power = power;
        this.name = name;
    }

    void attack( int hitPoint) {
        hitPoint = hitPoint - power;
        System.out.println( name + " は " + name + " に " + power + " ダメージを与えた。" );
    }

    int getHitpoint( ) {
        if ( hitPoint >= 0 ){
            System.out.println( name + "　の残りHP　: " + hitPoint );//HP>0ならそのまま表示
        }
        else System.out.println( name + "　の残りHP　: " + 0 );//HP<0なら0で表示

        return hitpoint;
    }

    void setHitpoint ( int hitpoint ) {
        Scanner input = new Scanner( System.in );
        System.out.println( "HPを入力 : " );
        this.hitPoint = input.nextInt();//HPを入力
    }

    boolean isAlive( ) {
        boolean b;
        b = ( hitPoint > 0 );//HP>0ならtrue
        return b;
        }
    }

    String getName( ) {
    if ( boolean b == false ) {
        String n = Fighter.name;//HP<0の名前の取得
        }
    }
