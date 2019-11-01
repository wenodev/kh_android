package day14;

class Test2{
    private int[] array;
    private int first;
    private int second;
    private int num;
    private int sumEven;
    private int sumOdd;
    private int lastRes;

    public Test2(int num){
        array = new int[num];
        first = 1;
        second = 1;
        this.num = num;
    }

    public void makeArray(){
        array[0] = first;
        array[1] = second;
        for(int i=2; i<num; i++){
            array[i] = array[i-1]+ array[i-2];
        }
    }

    public void calcEven(){
        for(int i=0; i<num; i++){
            if(array[i]%2 == 0){
                sumEven += array[i];
            }
        }
    }

    public void calcOdd(){
        for(int i=0; i<num; i++){
            if(array[i]%2 == 1){
                sumOdd += array[i];
            }
        }
    }

    public void lastResult(){
        lastRes = sumOdd-sumEven;
    }


    public void print(){
        for(int i=0; i<num; i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println(" ");

    }

    @Override
    public String toString() {
        return "sumEven : " + sumEven +"\n" +
                "sumOdd : " + sumOdd + "\n" +
                "lastRes : " + lastRes;
    }
}



public class HW2 {
    public static void main(String[] args) {
        Test2 test2 = new Test2(10);
        test2.makeArray();
        test2.calcEven();
        test2.calcOdd();
        test2.lastResult();
        test2.print();
        System.out.println(test2);
    }
}
