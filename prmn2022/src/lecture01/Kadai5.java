package lecture01;

public class Kadai5 {
    public static void main(String[] args) {
        int[] score = {41, 85, 72, 38, 80};
        int MIN = min(score);
        int MAX = max(score);
        double AVR = avr(score);
        System.out.println(MIN);
        System.out.println(MAX);
        System.out.println(AVR);
    }

    static int min(int score[]) {
        int Min = score[0];
        for (int i = 0; i < score.length; i++) {
            if (score[i] < Min) {
                Min = score[i];
            }
        }
        return Min;
    }

    static int max(int score[]) {
        int Max = score[0];
        for (int i = 0; i < score.length; i++) {
            if (score[i] > Max) {
                Max = score[i];
            }
        }
        return Max;
    }

    static double avr(int score[]){
        int sum = 0;
        for(int i = 0; i < score.length; i++){
            sum = sum + score[i];
        }
        double Avr = sum/ score.length;
        return Avr;
    }
}
