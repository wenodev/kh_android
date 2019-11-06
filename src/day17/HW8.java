package day17;

class H8{
    int num1;
    int num2;
    float num3;
    double num4;

    public H8(int num1, int num2, float num3, double num4) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
    }

    @Override
    public String toString() {
        return "H8{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", num3=" + num3 +
                ", num4=" + num4 +
                '}';
    }
}



public class HW8 {
    public static void main(String[] args) {
        H8 h8 = new H8(1,2,3,4);
        System.out.println(h8);
    }
}
