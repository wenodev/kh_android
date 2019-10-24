import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        /*
            숙제 5.
            1 2 4 8 16 32 64 128 238 ...
            위 수열의 데이터를 각각 배열에 저장하고
            인덱스는 0부터 시작한다.
            8번째, 10번째, 12번째, 16번째 인덱스의 값들을 추출하고
            추출한 값들을 모두 더한 값을 출력하시오.
         */

        Scanner input = new Scanner(System.in);
        System.out.print("몇개까지진행? ");
        final int NUMBER = input.nextInt();

        int[] series = new int[NUMBER];
        int sum = 0;

        series[0] = 1;

        for(int i=1; i<NUMBER; i++){
            series[i] = series[i-1] *2;
            System.out.println(series[i]);
        }

        for(int i=0; i<series.length; i++){
            sum += series[i];
        }
        System.out.println(sum);




    }

}
