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
        for( int i = 3; i <= number; i += 2 ) {
            int k = 0;
            for(int j = 3; j <= Math.sqrt ( i ); j += 2 ) {
                if( i % j == 0 ) {
                    k = 1;
                    break;
                }
            }
            if ( k == 0 ) {
                sosuu.add( i );
            }
        }
        return (sosuu);
    }

    void print ( ArrayList<Integer> sosuu ) {
        for (int s = 0; s < sosuu.size(); s++ ) {
            System.out.print( sosuu );
            if ( s != sosuu.size() - 1 ){
                System.out.print( "," );
            }
        }
    }
}

