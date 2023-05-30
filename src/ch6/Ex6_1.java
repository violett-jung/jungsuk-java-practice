package ch6;

public class Ex6_1 {
    public static void main(String[] args) {
        //1. 참조변수(리모컨)t 생성
        Tv t;
        //2. Tv(객체)생성 후 참조변수와 연결
        t = new Tv();
        //3. 객체의 사용: Tv인스턴스의 멤버변수를 7로 변경
        t.channel = 7;
        //4. 객체의 사용: Tv인스턴스의 channelDown() 메서드 호출
        t.channelDown();
        //5. 객체의 사용: 현재 채널 번호 출력
        System.out.println("현재 채널: " + t.channel); //현재 채널: 6

    }
}

//Tv(객체)을 생성하기 위한 Tv설계도(클래스)
class Tv{
    // Tv의 속성
    // 색깔, 전원, 채널
    String color;
    boolean power;
    int channel;

    // Tv의 기능
    // 전원 on/off, 채널up, 채널down
    void power(){
        power = !power;
    }
    void channelUp(){
        ++channel;
    }
    void channelDown(){
        --channel;
    }
}
