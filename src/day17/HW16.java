package day17;

import java.util.Scanner;

class Bank{
    String name;
    int accountNumber;
    int save;

    Scanner input = new Scanner(System.in);

    public Bank(String name, int accountNumber, int save) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.save = save;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name=" + name +
                ", accoutNumber=" + accountNumber +
                ", save=" + save +
                '}';
    }

    void inputMoney(){
        int money;
        System.out.print("입금할 금액?");
        money = input.nextInt();
        save += money;
        System.out.println("입금완료");
    }

    void outputMoney(){
        int money;
        System.out.print("출금할 금액?");
        money = input.nextInt();
        save -= money;
        System.out.println("출금완료");
    }
}

public class HW16 {
    public static void main(String[] args) {
        Bank bank = new Bank("주원", 1111, 500);
        System.out.println(bank);
        bank.inputMoney();
        System.out.println(bank);
        bank.outputMoney();
        System.out.println(bank);
    }
}
