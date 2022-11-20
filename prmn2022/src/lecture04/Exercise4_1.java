package lecture04;

public class Exercise4_1 {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter( 400, 120, "貴音" );
        Fighter fighter2 = new Fighter( 300, 190, "琴葉" );
        while ( true ) {
            fighter1.attack( fighter2.hitPoint );
            if ( !fighter2.isAlive() ) {
                System.out.println( fighter2.name + " は倒れた！" );
                System.exit( 0 );
            }
            fighter2.attack( fighter1.hitPoint );
            if ( !fighter1.isAlive() ) {
                System.out.println( fighter1.name + " は倒れた！" );
                System.exit( 0 );
            }
        }
    }
}
