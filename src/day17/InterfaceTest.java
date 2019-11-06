package day17;

interface Comparable{
    int compareTo(Object other);
}

class StrcmpTest implements Comparable{
    private double area = 0;

    public StrcmpTest(double a){
        area = a;
    }

    @Override
    public int compareTo(Object other) {
        StrcmpTest st = (StrcmpTest)other; //타입캐스팅 하는 코드


        return 0;
    }
}



public class InterfaceTest {
    public static void main(String[] args) {
        StrcmpTest str = new StrcmpTest(1);




    }
}
