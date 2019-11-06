package day17;

class H13{
    int dan;
    int[] arr;
    static int SIZE = 100;

    public H13() {
        this.dan = dan;
        this.arr = new int[100];
    }

    void settingArray(){
        for(int i=0; i<SIZE; i++){
            arr[i] = (i+1)*2;
        }
    }

    int getResult(){
        return arr[SIZE-1];
    }

}



public class HW13 {
    public static void main(String[] args) {
        H13 h13 = new H13();
        h13.settingArray();
        System.out.println(h13.getResult());
    }
}
