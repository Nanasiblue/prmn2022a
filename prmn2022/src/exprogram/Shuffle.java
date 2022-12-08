package exprogram;

import java.util.Random;

public class Shuffle {
    private int n;
    private int seed;
    private int [] data;

    Shuffle( int seed, int [] data ) {
        this.seed = seed;
        this.data = data;
    }

    public void shuffle( int seed, int [] data ) {
        n = data.length;
        Random rnd = new Random(seed);//任意のシードで固定する

        for (int i = n - 1; i >= 1; i--) {//フィッシャーイェーツによるランダムならべかえ
            int j = rnd.nextInt(i);
            int tmp = data[i];
            data[i] = data[j];
            data[j] = tmp;
        }
    }
}
