import java.util.Random;

public class HW7 {
    /*
        문제 5. ~77 을 bit로 표현하고 해석하시오.
        77 -> 0100 1101
       ~77 -> 1011 0010
      // 왼쪽에서 첫번째 1을 제외하고 반전
             0100 1110 = 78


        숙제 7-1. -137을 bit 로 표현하시오
        136 - 128 = 8
        11110111

        숙제 7-2. 10001010 11111010 을 10진수로 표현하시오.
                  01110101 00000101
                    117          5
        숙제 7-3 랜덤 숫자를 입력 받아서
        1024 단위로 정렬하도록 프로그램 하시오.
     */

    public static void main(String[] args) {
        Random random = new Random();
        int MAX_SIZE = 10;
        int number = 0;
        for(int i=0; i<MAX_SIZE; i++){
            number = random.nextInt(10000)+1;
            System.out.println((number&~1023));
        }
    }
}
