package day17;

import java.util.Scanner;

class H14{
    int num1;
    int num2;
    Scanner input = new Scanner(System.in);

    public H14() {
        System.out.print("num1입력 : ");
        this.num1 = input.nextInt();
        System.out.print("num2입력 : ");
        this.num2 = input.nextInt();
    }

    void compare(){
        if(num1>num2){
            System.out.println("num1이 더 크다");
        }else if(num1<num2){
            System.out.println("num2가 더 크다");
        }else{
            System.out.println("두 수는 같다");
        }
    }

}


public class HW14 {
    public static void main(String[] args) {
        H14 h14 = new H14();
        h14.compare();
    }
}
