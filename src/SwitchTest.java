public class SwitchTest {
    public static void main(String[] args) {
        int n=2;

        switch(n){
            case 10:
                System.out.println("A+");
                break;
            case 9 :
                System.out.println("A");
                break;
            case 8 :
                System.out.println("B+");
                break;
            case 7 :
                System.out.println("C+");
                break;
            case 6 :
                System.out.println("C");
                break;
            default:
                System.out.println("F");

        }
    }
}
