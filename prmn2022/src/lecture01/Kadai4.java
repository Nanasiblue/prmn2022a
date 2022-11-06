package lecture01;

public class Kadai4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for(int i = 0; i < 100; i++){
            array[i] = i + 1;
        }
        int sum = 0;
        for(int j = 1; j < 100; j++){
            if(j % 2 == 0){
                sum = sum + array[j];
            }
        }
        System.out.print(sum);
    }
}

//for文の方が見た目的に分かりやすい
