import java.util.Random;

public class HW6 {
    public static void main(String[] args) {
        /*
            숙제6-1.
            배열 100개에 무작위 데이터를 할당한다.
            이 무작위 데이터의 범위는 1~4096 사이로 할당한다.

            배열 요소 하나가 의미하는 것은 4096byte 에 해당한다.
            이 때, 낭비된 공간의 크기를 산출하시오.

            숙제6-2.
            추가적으로 배열 요소 하나의 공간이
            4096, 8192, 16384, 32768, 65536, 2^17 까지  가능하다고 가정한다.
            그리고 무작위 데이터는 1~2^17 까지 할당할 수 있다.
            이 경우에 이것을 가장 효율적으로 관리하기 위한 프로그램을 작성하시오.
            (낭비된 공간이 얼마나 있는지와
            각각의 공간을 효육적으로 쓸 수 있도록 한다
            비트 연산을 사용하면 효율성이 극대화 됨
            편의상 공간의 개수는 10개로 진행하도록 한다)

            커널이 메모리를 관리하는 메커니즘
         */
        final int SIZE = 100;
        Random random = new Random();
        int[] ranArr1 = new int[SIZE];
        int[] ranArr2 = new int[SIZE];
        int sum =0;

        for(int i=0; i<SIZE; i++){
            ranArr1[i] = random.nextInt(4096) + 1;
        }

        for(int i=0; i<SIZE; i++) {
            ranArr2[i] = 4096 - ranArr1[i];
            sum += ranArr2[i];
            System.out.println("ranArr2 [" + i +"] = " + ranArr2[i]);
            System.out.println("sum = " + sum);
        }

    }
}
