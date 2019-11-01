package day14;

import java.util.Scanner;

class Test1{
    private int[] array;
    private int first;
    private int second;
    private int num;
    Scanner input = new Scanner(System.in);

    public Test1(){
        do{
            System.out.println("2보다 큰 정수를 입력해주세요");
            System.out.print("정수 입력: ");
            num = input.nextInt();
        }while(num<2);




        array = new int[num];
        first = 1;
        second = 3;

    }

    public void cal(){
        array[0] = first;
        array[1] = second;
        for(int i=2; i<num; i++){
            array[i] = array[i-1]+ array[i-2];
        }
    }

    public void print(){
        System.out.println(array[num-1]);
    }


}


public class HW1 {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.cal();
        test1.print();

    }
}
