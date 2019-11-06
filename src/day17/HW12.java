package day17;

import java.util.Random;

class H12{
    Random random = new Random();
    int ranNum;
    int shiftNum;

    public H12() {
        this.ranNum = random.nextInt(10)+1;
        System.out.println(this.ranNum);
        this.shiftNum = random.nextInt(4)+1;
        System.out.println(this.shiftNum);
    }

    void shift(){
        ranNum = ranNum << shiftNum;
    }

    @Override
    public String toString() {
        return "H12{" +
                " ranNum=" + ranNum +
                ", shiftNum=" + shiftNum +
                '}';
    }
}



public class HW12 {
    public static void main(String[] args) {
        H12 h12 = new H12();
        h12.shift();
        System.out.println(h12);
    }
}
