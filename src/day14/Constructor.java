package day14;

//컴퓨터에서 로딩은 메모리에 올린다는 뜻이다.


class Student {
    String name;
    String major;
    String minor;
    int age;

    public Student(){
        name = "11";
        major = "22";
        minor = "33";
        age = 44;
    }

    public Student(int age){
        name = "11";
        major = "22";
        minor = "33";
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMinor() {
        return minor;
    }

    public void setMinor(String minor) {
        this.minor = minor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", minor='" + minor + '\'' +
                ", age=" + age +
                '}';
    }
}


public class Constructor {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println(student1);

        Student student2 = new Student(3);
        System.out.println(student2);



    }
}
