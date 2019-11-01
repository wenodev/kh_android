import java.util.Random;
import java.util.stream.DoubleStream;

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
//        final int SIZE = 100;
//        final int MAXMEM = 4096;
//
//        Random random = new Random();
//        int[] ranArr1 = new int[SIZE];
//        int[] ranArr2 = new int[SIZE];
//        int sum =0;
//
//        for(int i=0; i<SIZE; i++){
//            ranArr1[i] = random.nextInt(MAXMEM) + 1;
//            System.out.println("ranArr1 [" + i +"] = " + ranArr1[i]);
//        }
//
//        for(int i=0; i<SIZE; i++) {
//            ranArr2[i] = MAXMEM - ranArr1[i];
//            sum += ranArr2[i];
//            System.out.println("ranArr2 [" + i +"] = " + ranArr2[i]);
//            System.out.println("sum = " + sum);
//        }
//     sout = System.out.println();
//   ---------------------------------------------------------------- //

        final int SIZE = 10;
        Random random = new Random();
        int[] ranArr1 = new int[SIZE];
        int[] ranArr2 = new int[SIZE];
        int[] storage = {4096,8192, 16384, 32768, 65536,131072};
        int[] ranArr4 = new int[SIZE];
        int sum =0;
        int ran = 0;
        int temp1 = 0;
        int temp2 = 0;

        for(int i=0; i<SIZE; i++){
            ran = random.nextInt(6);
            ranArr4[i] = storage[ran];
            System.out.println("ranArr4 [" + i +"] = " + ranArr4[i]);
        }

        for(int i=0; i<SIZE; i++) {
            ranArr1[i] = random.nextInt(131072) + 1;
            System.out.println("ranArr1 [" + i +"] = " + ranArr1[i]);
        }

        for(int i=0; i<SIZE; i++){
            temp1 = (ranArr1[i] &~ 4095);
            System.out.println(temp1);
//            for(int j=0; j<SIZE; j++){
//                if(temp1 == ranArr4[j]){
//                    temp2 = ranArr4[j] - ranArr1[j];
//                }
//            }
//            ranArr4[i] = (temp2 &~ 4095);
        }



//        for(int i=0; i<SIZE; i++) {
//            ranArr2[i] = ranArr4[i] - ranArr1[i];
//            sum += ranArr2[i];
//            System.out.println("ranArr2 [" + i +"] = " + ranArr2[i]);
//            System.out.println("sum = " + sum);
//        }


    }
}



// NAND 연산은 해당 숫자보다 작은 최대의 배수값을 찾아준다
// 150 보다 작은 4의 최대 배수를 구하시오
// 150 &~ 3