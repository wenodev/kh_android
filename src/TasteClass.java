// 객체는 메모리에 할당이 된 상태





class Car{
    int speed;
    String color;

    void setSpeed(int s){
        speed = s;
    }
    int getSpeed(){
        return speed;
    }


}



public class TasteClass {
    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.speed = 70;
        mycar.color = "Blue";

        System.out.println("mycar's speed : " + mycar.speed);
        System.out.println("mycar's color : " + mycar.color);
    }
}
