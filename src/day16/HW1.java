package day16;

class ChallengeProb{
    private int[] wirelessFreq;

    public ChallengeProb( ) {

        wirelessFreq = new int[]{
                1, 5, 10, 10, 15, 150, 1500, 2300,
                2350, 2350, 2350, 2350, 2350, 2350, 2350, 2350,
                23423, 1231, 52352, 2352332, 13123, 34531, 2342,
                1231, 2342, 2342, 368, 4675, 47905, 45604, 4500,
                5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000,
                5000
        };
    }

    public void AscendingOrder(){
        // 정렬에 활용할 변수들
        int i, j, key;

        // 배열의 원소 개수를 파악하는데 사용함
        int len = wirelessFreq.length;
        for(i = 1; i < len; i++) {
            key = wirelessFreq[i];

            for(j = i - 1; wirelessFreq[j] > key; j--) {
                wirelessFreq[j + 1] = wirelessFreq[j];
            }

            wirelessFreq[j + 1] = key;
        }
    }

    public void show(){
        for(int i = 0; i < wirelessFreq.length; i++) {
            System.out.println("arr[" + i + "] = " + wirelessFreq[i]);
        }
    }

    public void CheckRepetition(){
        // 중복이 없는 숫자를 배치할 배열
        int[] number;
        // 각 숫자 값들이 얼마나 중복되었는지를 나타내는 배열
        int[] freqCheck;
        int nonRecursNum = 0;
        // 중복되지 않는 원소가 몇 개 있는지 계산함

        int i=0,j=0;

        for(i = 0; i < wirelessFreq.length; i++) {
            if(i == 0) {
                nonRecursNum++;
                // continue 는 무조건 다시 for 문으로 돌아가게 한다.
                // 단 증감부를 거치게 됨
                continue;
            }

            // 중복이 없으면
            for(j = 0; j < i; j++) {
                // 중복이 있다면 for 문을 바로 빠져나옴
                // 그러므로 j 값이 어떤 경우에도 i 와 같아질 수 없다.
                if(wirelessFreq[i] == wirelessFreq[j]) {
                    break;
                }
            }

            // 그러므로 i 가 j 와 같다는 것은 중복이 없다는 뜻
            if(j == i)
                nonRecursNum++;
        }
        // 중복되지 않는 원소가 몇 개 있는지 계산 끝

        System.out.println("중복 없는 원소의 개수 = " + nonRecursNum);
    }

    public void Allocate(){

    }

}



public class HW1 {
    public static void main(String[] args) {
        ChallengeProb ch = new ChallengeProb();
        ch.AscendingOrder();
        ch.show();
        ch.CheckRepetition();
    }
}
