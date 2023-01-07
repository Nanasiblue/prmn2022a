package lecture07;

public class Age {
    private int age;

    public Age(int age) {
        if ( age >= 18 && age <= 122 ) {
            this.age = age;
            return;
        }
        throw new RuntimeException(age + "は不正な年齢です");
    }

    public boolean isOver20() {
        return age >= 20;
    }
}
