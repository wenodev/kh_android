package day17;

class Grade{
    int grade;

    public Grade(int grade) {
        this.grade = grade;
    }

    void showcase(){
        if(grade >= 90){
            System.out.println("A");
        }else if(grade >= 80){
            System.out.println("B");

        }else if(grade >= 70){
            System.out.println("C");

        }else if(grade >= 60){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
    }



    @Override
    public String toString() {
        return "Grade{" +
                "grade=" + grade +
                '}';
    }
}

public class HW17 {
    public static void main(String[] args) {
        Grade grade = new Grade(80);
        grade.showcase();
    }
}
