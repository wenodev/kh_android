import java.util.Random;


public class PersonalTest2 {
    // 정적 - 컴파일러
    // 동적 - 런타임
    public static void main(String[] args) {

        Random random = new Random();
        final int SIZE = 10;
        int[] array = new int[SIZE];
        int[] idx = new int[SIZE];
        int[] repository = {4096, 8192, 16384, 32768, 65536, 131072};
        int[] tempForMin = new int[SIZE];;
        int[] freeArea = new int[100];
        int temp=0;
        int res=0;
        int repoSum = 0;
        int flag = 0;
        int count=0;

        // array 배열 임의값으로 초기화
        for (int i = 0; i < SIZE; i++) {
            array[i] = random.nextInt(131072) + 1;
            System.out.println("array : " + array[i]);
        }

        for (int i = 0; i < repository.length; i++) {
            System.out.println("repository : " + repository[i]);
        }

        for(int i=0; i<SIZE; i++){
            //기존에 메모리가 할당된 부분 중 남은 부분에 넣을 수 있나 먼저 확인
            flag = 0;
            for (int j=0; j<idx.length; j++){
                if(array[i] < idx[j]){
                    idx[j] = (idx[j] - array[i]) &~ 4095;
                    array[i] = 0;
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                // 메모리를 할당하여 값 저장
//                for(int k=0; k<repository.length; k++){
//                    if(array[i] < repository[k]){
//                        idx[i] = (repository[k] - array[i]) &~ 4095;
//                        System.out.println("idx" + i +" : " + idx[i]  + " " + " repository : " + repository[k]+" " + "array : " + array[i]);
//                        array[i] = 0;
//                        break;
//                    }
//                }
                for(int k=0; k<repository.length; k++){
                    if(array[i] < repository[k]){
                        idx[i] = (repository[k] - array[i]);
                        freeArea[count] = idx[i];
                        for(int j=0; j<repository.length; j++){
                            if(freeArea[count] < repository[j]){
                                freeArea[count] = repository[j] - freeArea[count];
                                System.out.println("freeArea[" + count + "] : " + freeArea[count] );
                                count++;
                            }
                        }



                        System.out.println("idx" + i +" : " + idx[i]  + " " + " repository : " + repository[k]+" " + "array : " + array[i]);
                        array[i] = 0;
                        break;
                    }
                }





            }


        }

        for(int i=0; i<array.length; i++){
            System.out.println("array : " + array[i]);
        }

        for(int i=0; i<idx.length; i++){
            System.out.println("idx" +i +" : " + idx[i]);
        }



    }
}
