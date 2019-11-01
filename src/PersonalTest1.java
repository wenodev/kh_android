import java.util.Random;

public class PersonalTest1 {
    public static void main(String[] args) {
        Random random = new Random();
        final int SIZE = 10;
        int[] array = new int[SIZE];
        int[] idx = new int[SIZE];
        int[] repository = {4096, 8192, 16384, 32768, 65536, 131072};
        int[] tempForMin = new int[SIZE];;
        int temp=0;
        int res=0;
        int repoSum = 0;

        // array 배열 임의값으로 초기화
        for (int i = 0; i < SIZE; i++) {
            array[i] = random.nextInt(131072) + 1;
            System.out.println("array : " + array[i]);
        }
        // idx 배열 임의값으로 초기화
        for (int i = 0; i < SIZE; i++) {
            idx[i] = repository[random.nextInt(6)];
            System.out.println("idx : " + idx[i]);
            repoSum += idx[i];
        }

        for(int i=0; i<SIZE; i++){

            //idx와 array의 차이를 tempFormin에 저장
            for(int j=0; j<SIZE; j++){
                tempForMin[j] = idx[j] - array[i];
            }

            //배열 출력
            for(int j=0; j<SIZE; j++){
                System.out.println("tempForMin"+ i + " : " + tempForMin[j]);
            }

            //첫번째 temp 초기화
            for(int j=0; j<SIZE; j++){
                if(tempForMin[j]>0){
                    temp=tempForMin[j];
                    break;
                }
            }

            //양수중에 차이가 가장 작은 인덱스 찾기
            for(int j=0; j<SIZE; j++) {
                if(tempForMin[j]>0){
                    if(temp>tempForMin[j]){
                        temp = tempForMin[j];
                    }
                }
            }
            System.out.println("temp1 : " + temp);

            for(int j=0; j<SIZE; j++) {
                if(tempForMin[j] == temp){
                    idx[j] = (idx[j] - array[i]) &~ 4095;
                    array[i] = 0;
                    break;
                }
            }

            for (int j = 0; j < SIZE; j++) {
                System.out.println("idx : " + idx[j]);
            }

        }
        for(int i=0; i<SIZE; i++){
            res += idx[i];
        }
        System.out.println("총 메모리 : " + repoSum);
        System.out.println("사용한 메모리 : " + (repoSum-res));
        System.out.println("낭비된 메모리 : " + res);

        for(int i=0; i<SIZE; i++){
            System.out.println("사용하지 못한 데이터 : " + array[i]);
        }
    }
}
