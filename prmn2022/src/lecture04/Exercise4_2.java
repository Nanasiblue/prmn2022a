package lecture04;

public class Exercise4_2 {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.existsAccount("青野圭汰", "1005");
        atm.resisterAccount("青野圭汰", "1005");
        if ( atm.existsAccount("青野圭汰", "1005") ) {
            atm.deposit("1005",1000);
            atm.withdraw("1005", 2000);
            atm.withdraw("1005", 500);
        }
    }
}
