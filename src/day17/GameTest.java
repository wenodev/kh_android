package day17;

interface skills{
    void skill1();
    void skill2();
    void skill3();
}

class Adventure implements skills{
    float atk, def, intel, vit, ag;

    public Adventure(float atk, float def, float intel, float vit, float ag) {
        this.atk = atk;
        this.def = def;
        this.intel = intel;
        this.vit = vit;
        this.ag = ag;
    }

    @Override
    public void skill1() {
        System.out.println("줍기");
    }

    @Override
    public void skill2() {
        System.out.println("세게 때리기");

    }

    @Override
    public void skill3() {
        System.out.println("빠르게 때리기");

    }
}

class Warrior extends Adventure{
    float anger;
    public Warrior(float atk, float def, float intel, float vit, float ag, float anger) {
        super(atk, def, intel, vit, ag);
        this.anger = anger;
    }

    @Override
    public void skill1() {
        System.out.println("방패치기");
    }

    @Override
    public void skill2() {
        System.out.println("휩쓸기");
    }

    @Override
    public void skill3() {
        System.out.println("초절");
    }
}



public class GameTest {
    public static void main(String[] args) {
        Adventure adventure = new Adventure(10,10,10,10, 10);
        adventure.skill1();
        adventure.skill2();
        adventure.skill3();

        Warrior warrior = new Warrior(70,20,40,60, 50,100);
        warrior.skill1();
        warrior.skill2();
        warrior.skill3();




    }
}
