package exprogram;

import java.util.ArrayList;

public class ViewD {
    private ArrayList<Character> text;

    public ViewD(ArrayList<Character> text) {
        this.text = text;
    }

    void view(ArrayList<Character> text) {
        for (int i = 0; i < text.size(); i++) {
            System.out.print(text.get(i));
        }
    }
}

