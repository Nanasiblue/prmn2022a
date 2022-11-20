package lecture04;

public class Fighter {
    int hitPoint;
    int power;
    String name;

    Fighter( int hitPoint, int power, String name ) {
        this.hitPoint = hitPoint;
        this.power = power;
        this.name = name;
    }

    void attack( int hitPoint) {
        hitPoint = hitPoint - power;
        System.out.println( name + " は " + name + " に " + power + " ダメージを与えた。" );
        if ( hitPoint >= 0 ){
            System.out.println( name + "　の残りHP　: " + hitPoint );
        }
        else System.out.println( name + "　の残りHP　: " + 0 );
    }

    boolean isAlive( ) {
        boolean b;
        b = ( hitPoint > 0 );
        return b;
        }
    }
