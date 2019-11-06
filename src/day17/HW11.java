package day17;

import java.util.Random;

class H11{
    Random random = new Random();
    int num1;
    int num2;

    public H11() {
        this.num1 = random.nextInt(10)+1;
        this.num2 = random.nextInt(10)+1;
        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);
    }

    void cal(){
        System.out.println("AND연산 : " + (num1 & num2));
        System.out.println("OR : " + (num1 | num2));
        System.out.println("XOR : " + (num1 ^ num2));
        System.out.println("num1의 not" + ~num1);
        System.out.println("num2의 not"  + ~num2);
    }

}


public class HW11 {
    public static void main(String[] args) {
        H11 h11 = new H11();
        h11.cal();
    }
}
