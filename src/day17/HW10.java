package day17;

import java.util.Random;

class H10{
    Random random = new Random();
    int num;

    public H10( ) {
        this.num = random.nextInt(10)+1;
    }

    @Override
    public String toString() {
        return "H10{" +
                "num=" + num +
                '}';
    }
}

public class HW10 {
    public static void main(String[] args) {
        H10 h10 = new H10();
        System.out.println(h10);
    }
}
