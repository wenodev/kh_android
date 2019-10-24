import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class QuizAns5 {
    public static void main(String[] args) {
        /*
            1,    5,    10,   10,   15,   150,  1500, 2300,
            2350, 2350, 2350, 2350, 2350, 2350, 2350, 2350,
            12342,123132,13123,54535,123123,23424,234234,123224,
            43244,674654,23424,12356,123156,56777,644323,678908,
            5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000

            위와 같은 데이터가 배열에 들어있다고 가정한다
            여기서 가장 빈도수가 높은 주파수 대역을 2개 추출하고
            몇 번 검출되었는지 확인하는 프로그램을 작성하시오.
         */


        Random random = new Random();
        final int NUMBER = 40;
        int[] frequency = {
                1,    5,    10,   10,   15,   150,  1500, 2300,
                2350, 2350, 2350, 2350, 2350, 2350, 2350, 2350,
                12342,123132,13123,54535,123123,23424,234234,123224,
                43244,674654,23424,12356,123156,56777,644323,678908,
                5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000
        };
        int count = 0;
        int[] res = new int[NUMBER];



        for(int i=0; i<NUMBER; i++){
            System.out.println(frequency[i]);
        }
        System.out.println("-------------");


        for(int i=0; i<NUMBER; i++){
            count = 0;
            for(int j=0; j<NUMBER; j++){
                if(i == j)
                    continue;

                if(frequency[i] == frequency[j]){
                    count++;
                    frequency[j] = random.nextInt();
                }

            }
            res[i] = count;
        }

        for(int i=0; i<res.length; i++){
            System.out.println(i+1 + "번째 값 = " + res[i]);
        }




    }
}
