package exprogram;

import java.util.ArrayList;

public class CountIndex {
    private int index;
    private ArrayList<Integer> Number = new ArrayList<>();


    public CountIndex(int index) {
        this.index = index;
    }

    public void setNumber(ArrayList<Integer> number) {
        Number = number;
    }
}
