package lecture04;

public class Exercise4_1 {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter( 400, 100, "貴音" );
        Fighter fighter2 = new Fighter( 300, 150, "琴葉" );
        while ( true ) {
            fighter1.attack( fighter2 );
            fighter2.setHitPoint( fighter2.hitPoint );
            int x = fighter2.getHitpoint();
            if (x >= 0) {
                System.out.println( fighter2.getName() + "　の残りHP　: " + x );//HP>0ならそのまま表示
            } else System.out.println( fighter2.getName() + "　の残りHP　: " + 0);//HP<0なら0で表示
            if ( !fighter2.isAlive() ) {
                System.out.println( fighter2.name + " は倒れた！" );//falseならHP<0　倒れたことを表示
                System.exit( 0 );
            }
            fighter2.attack( fighter1 );
            int y = fighter1.getHitpoint();
            if (y >= 0) {
                System.out.println( fighter1.getName() + "　の残りHP　: " + y );//HP>0ならそのまま表示
            } else System.out.println( fighter1.getName() + "　の残りHP　: " + 0);//HP<0なら0で表示
            if ( !fighter1.isAlive() ) {
                System.out.println( fighter1.name + " は倒れた！" );//falseならHP<0　倒れたことを表示
                System.exit( 0 );
            }
        }
    }
}
