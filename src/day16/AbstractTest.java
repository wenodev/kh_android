package day16;
/*
abstract 클래스에 있는 내용은
반드시 생성자쪽에서 같이 처리해줘야한다.

상속을 바았지만 super로 처리하는 방식은 아니다.
이것을 응용한 것이 interface인데
super 처리 방식이 아니라 언제나 형태를 바꿀 수 있다.
 */

abstract class Message{
    public String subject;
    public String content;

    abstract public void test();
}

class Messanger extends Message{
    private String sender;
    private String receiver;

    public Messanger(String sender, String receiver, String subject, String content) {
        this.sender = sender;
        this.receiver = receiver;
        this.subject = subject;
        this.content = content;
    }

    public String toString(){
        return  "송신자 = " + sender + "\n" +
                "수신자 = " + receiver + "\n" +
                "제목 = " + subject + "\n" +
                "내용 = " + content + "\n";
    }

    public void test(){
        System.out.println("haha");
    }

}


public class AbstractTest {
    public static void main(String[] args) {
        Messanger m = new Messanger("John","Tazan","사직서","회사가 너무 구려서 못다니겠어요");
        System.out.println(m);
        m.test();
    }
}
