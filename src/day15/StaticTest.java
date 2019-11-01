package day15;

// static 영역은 데이터가 어떻게 쌓이는가?
// this에서 thisfh 갈때 어찌감?
// heap에서 메모리가 삭제 되는 순간
// 라이젠9 VS intel9
// 멀티쓰레드(순차성이 보장될 때, 즉 의존성)  vs 클럭수(그냥 연산 빠른거)

class StaticCnt {
    static int[] cnt;

    public StaticCnt(){
        cnt  = new int[10];;
        cnt[0]++;
        System.out.println(cnt[0]);
    }
}

public class StaticTest {
    public static void main(String[] args) {
        StaticCnt staticCnt1 = new StaticCnt();
        StaticCnt staticCnt2 = new StaticCnt();
        StaticCnt staticCnt3 = new StaticCnt();

    }
}
