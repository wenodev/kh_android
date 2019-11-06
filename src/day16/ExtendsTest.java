package day16;

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("person!!");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }
}

class Professor extends Person{
    private String major;
    private Boolean isdoctorate;

    public Professor(String name, int age, String major, boolean isdoctorate) {
        super(name, age);
        this.major = major;
        this.isdoctorate = isdoctorate;
        System.out.println("professor!!");

    }

    @Override
    public String toString() {

        return
                " name=" + this.name +'\'' +
                " age=" + this.age +'\'' +
                " major=" + major + '\'' +
                " isdoctorate=" + isdoctorate;
    }
}

class NoExtendsProfessor{
    private String name;
    private int age;
    private String major;
    private Boolean isdoctorate;

    public NoExtendsProfessor(String name, int age, String major, boolean isdoctorate) {
        this.name = name;
        this.age = age;
        this.major = major;
        this.isdoctorate = isdoctorate;
    }

    @Override
    public String toString() {
        return "NoExtendsProfessor{" +
                "name='" + name + '\'' +
                ", age=" + age + '\'' +
                ", major='" + major + '\'' +
                ", isdoctorate=" + isdoctorate +
                '}';
    }
}




class Employee extends Person{
    public String kind;
    public Boolean canIleave;

    public Employee(String name, int age, String kind, boolean canIleave) {
        super(name, age);
        this.kind = kind;
        this.canIleave = canIleave;
        if(this.canIleave == true) {
            System.out.println("즐퇴~");
        }else{
            System.out.println("야근 ㅅㄱ");
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "kind=" + kind +
                ", canIleave=" + canIleave +
                '}';
    }
}







public class ExtendsTest {
    public static void main(String[] args) {
        Professor p1 = new Professor("John",40,"coputer", true);
        System.out.println(p1);

        NoExtendsProfessor nep1 = new NoExtendsProfessor("Tom",35,"history", false);
        System.out.println(nep1);

        Employee emp1 = new Employee("J", 29, "IT", true);
        System.out.println(emp1);
    }
}
