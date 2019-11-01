import java.util.Random;

class AlignTest{
    Random random = new Random();
    int MAX_SIZE = 10;
    int[] alignArray = new int[MAX_SIZE];
    int num = 0;



    void init(){
        for(int i=0; i<MAX_SIZE; i++){
            num = random.nextInt(10000)+1;
            alignArray[i] = num &~ 1023;
        }
    }
    void print(){
        for(int i=0; i<MAX_SIZE; i++){
            System.out.println("alignArray[" + i +"] : " + alignArray[i]);
        }
    }
}


public class test1 {
    public static void main(String[] args) {
        AlignTest alignTest = new AlignTest();
        alignTest.init();
        alignTest.print();


    }
}
