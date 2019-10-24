import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        /*
            숙제4. 아래와 같은 수열이 존재한다.
            1 1 3 4 5 8 12 17 25 37 ...

           키보드 입력을 받아 몇 번째 항 가지
           합치기(sigma)를 수행할지 정한다.

           합치기 결과를 출력하시오.
         */
        Scanner input = new Scanner(System.in);

        System.out.print("몇 번째 항까지 sigma 하시겠습니까? ");
        int i = input.nextInt();
        int count = i-3;
        int num1=1;
        int num2=1;
        int num3=3;
        int res=0;
        int sum = 5;

        while(count-- > 0){
            res = num1 + num3;  //   4 5
            num1 = num2;          // 1 3
            num2 = num3;          // 3 4
            num3 = res;         //   4 5
            sum += num3;         //   4
            System.out.println("res: " + res);
            System.out.println("sum: " + sum);
        }
    }
}
