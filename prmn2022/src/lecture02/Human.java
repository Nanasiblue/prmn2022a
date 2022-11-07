package lecture02;

public class Human {

    String name;
    int age;

    Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    void print( ) {
        if (age >= 23) {
            System.out.println(name + " " + age + "歳です");
        }
        if (age < 18) {
            System.out.println("生徒:" + name + " " + age + "歳です");
        }
        if (age >= 18 && age < 22) {
            System.out.println("学生:" + name + " " + age + "歳です");
        }
    }
}
