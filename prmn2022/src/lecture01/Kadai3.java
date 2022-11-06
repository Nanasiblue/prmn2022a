package lecture01;

import java.util.Scanner;

public class Kadai3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("年齢：");
        int age = input.nextInt();
        while(true) {
            if (age > 0 && age < 20) {
                System.out.print("I am " + age + " years old so I cannot drink liquor");
                break;
            }
            if (age < 124 && age >= 20) {
                System.out.print("I am " + age + " years old so I can drink liquor");
                break;
            }
            if (age < 0 || age >= 124) {
                System.out.println("The age is too small or too big! Enter again");
                System.out.print("年齢：");
                age = input.nextInt();
            }
        }
    }
}
