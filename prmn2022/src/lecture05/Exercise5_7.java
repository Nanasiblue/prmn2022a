package lecture05;
import lecture03.Vegetable;

import java.util.ArrayList;

public class Exercise5_7 {
    public static void main(String[] args) {
        ArrayList<Insect> insects = new ArrayList<>();
        insects.add(new Insect());
        insects.add(new Butterfly());
        insects.add(new Locust());
        insects.add(new SwallowtailButterfly());
        for (Insect insect : insects) {
            insect.move();
            System.out.print( "\n" );
        }
    }
}
