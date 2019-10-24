public class challenge1 {
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
        int[] wirelessFreq = {
                1,    3,    10,   5,   15,   150,  1500, 2300,
                2350, 2350, 2350, 2350, 2350, 2350, 2350, 2350,
                12342,123132,13123,54535,123123,23424,234234,123224,
                43244,674654,23424,12356,123156,56777,644323,678908,
                5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000
        };


        int i,j,key;
        int len = wirelessFreq.length;

        //정렬 알고리즘(Insertion Sort)
        for(i=1; i<len; i++){
            key = wirelessFreq[i];

            for(j = i-1; wirelessFreq[j] > key; j--){
                wirelessFreq[j+1] = wirelessFreq[j];
            }
            wirelessFreq[j+1] = key;
        }
        for( i = 0; i<len; i++){
            System.out.println(wirelessFreq[i]);
        }

        int[] number;
        int[] freqCheck;

        /*
            ###추가사항###
            프로그램을 개발하다보면 최초 설계와는 다르게
            구현상 문제들이 발생하는 경우가 있습니다.
            이런 경우에 해당 문제를 어떻게 해결할 것인지 짱구를 굴립니다~

            숫자 배열과 빈도수 배열을 작성하는데 문제가 있다.
            어떤 문제가 있는가?
            중복되는 숫자가 몇 개 있는지 모르기 때문에
            정확한 원소의 개수를 산출 할 수 없다.

            6.그러므로 먼저 중복되지 않은 원소 개수를 판별할 필요가 있다.
         */
        int nonRecursNum = 0;

        for( i=0; i<len; i++){
            if(i==0) {
                nonRecursNum++;
                continue;
            }

            // 중복이 없으면
            for(j=0; j<i; j++){
                // 중복이 있다면 for 문을 바로 빠져나옴
                // 그러므로 j 값이 어떤 경우에도 i와 같아질 수 없다.
                if(wirelessFreq[i] == wirelessFreq[j]){
                    break;
                }
            }

            if(i==j) nonRecursNum++;


        }
        System.out.println("중복 없는 원소의 개수 = " + nonRecursNum);



    }
}
