package lecture04;

import java.util.ArrayList;

public class ATM {
    private ArrayList<Account> accounts;

    public ATM() {
        this.accounts = new ArrayList<>();
    }

    public void resisterAccount(String name, String number) {
        Account account = new Account(name, number);
        this.accounts.add(account);
        System.out.println(name + "さんを登録完了しました。 口座番号: " + number);
    }

    public boolean existsAccount(String name, String number) {
        for (Account account : accounts) {
            if (account.getName().equals(name) && account.getNumber().equals(number)) {
                System.out.println(name + "さん（口座番号: " + number + " ）は存在します。");
                return true;
            }
        }
        System.out.println(name + "さん（口座番号:　" + number + " ）は存在しません。");
        return false;
    }

    public void deposit(String number, long money) {
        for (Account account : accounts) {
            if (account.getNumber().equals(number)) {
                account.setBalance(account.getBalance() + money);
                System.out.println("口座番号: " + number + "　に　" + money + "円入金");
            }
        }
        System.out.println("口座番号: " + number + "は存在しません。");
    }

    long withdraw(String number, long money) {
        for (Account account : accounts) {
            if (account.getNumber().equals(number)) {
                long balance = account.getBalance();
                long newbalance = balance - money;
                if (newbalance < 0) {
                    System.out.println("口座番号: " + number + " から " + money + "円引き出せませんでした。" +
                            "残高: " + balance + "円です。");
                    return 0;
                } else {
                    account.setBalance(newbalance);
                    System.out.println("口座番号: " + number + " から " + money + "円引き出しました。" +
                            "残高: " + balance + "円です。");
                    return money;
                }
            }
        }
        System.out.println("口座番号: " + number + " は存在しませんでした。");
        return 0;
    }
}

