import java.util.Scanner;

public class WhileTest {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);

//        System.out.print("몇 번 반복할까요 ?");
//        int num = input.nextInt();
//
//        while(--num > 0){
//            System.out.println("반복합니다." + num);
//        }

        /*
            문제. while 문을 사용해서
            1~100 까지 숫자중 3의 배수를 추출하시오.
            (for 문 사용 금지)
         */
        int i = 1;
        while(i++ <=100){
            if(i%3 == 0){
                System.out.println(i);
            }
        }
    }
}
