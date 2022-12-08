package exprogram;

import java.util.ArrayList;

public class View {
    private ArrayList<Integer> text;

    public View(ArrayList<Integer> text) {
        this.text = text;
    }

    public void view(ArrayList<Integer> text) {
        for ( int i = 0; i < text.size(); i++ ) {
            System.out.print(text.get(i));
            if ( i != text.size() - 1 ) {
                System.out.print(",");
            }
        }
    }
}
