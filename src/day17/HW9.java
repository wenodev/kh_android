package day17;

import java.util.Scanner;

class H9{
    int num1;
    int num2;
    float num3;
    double num4;

    Scanner input = new Scanner(System.in);


    public H9() {
        System.out.print("num1입력 : ");
        this.num1 = input.nextInt();

        System.out.print("num2입력 : ");
        this.num2 = input.nextInt();

        System.out.print("num3입력 : ");
        this.num3 = input.nextFloat();

        System.out.print("num4입력 : ");
        this.num4 = input.nextDouble();
    }

    @Override
    public String toString() {
        return "H8{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", num3=" + num3 +
                ", num4=" + num4 +
                '}';
    }
}

public class HW9 {
    public static void main(String[] args) {
        H9 h9 = new H9();
        System.out.println(h9);
    }

}
