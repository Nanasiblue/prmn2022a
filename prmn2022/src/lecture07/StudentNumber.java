package lecture07;

public class StudentNumber {
    private String number;

    public StudentNumber(String number) {
        String head = number.substring(0,1);
        String num = number.substring(1,8);
        if (head.equals("b") && num.length() == 7) {
            this.number = number;
            return;
        }
        throw new RuntimeException(number + "is not student number");
    }
}
