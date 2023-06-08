package ch7;

//Ex7_1: 상속
public class Ex7_1 {
    public static void main(String[] args) {
        //SmartTv 인스턴스 생성
        SmartTv stv = new SmartTv();
        //channel에 10 저장
        stv.channel = 10;
        //channel 1만큼 증가
        stv.channelUp();
        //현재 채널 출력: 11
        System.out.println(stv.channel);
        //text가 Hello, World!!인 캡션 출력 -> 아직 off인 상태이므로 출력 안되어야함
        stv.displayCaption("Hello, World!!");
        //캡션기능 on
        stv.caption = true;
        //text가 Hello, World!!인 캡션 출력
        stv.displayCaption("Hello, World!!");

        
    }

}

// 부모클래스 Tv
class Tv {
    // 멤버 5개
    // 인스턴스변수 power(on/off), channel
    boolean power;
    int channel;

    //기본생성자
    Tv() {

    }

    // 인스턴스 메서드
    // 전원온오프 power(), 채널업 channelUp(), 채널다운 channelDown()
    void power() {
        power = !power;
    }
    void channelUp() {
        ++channel;
    }
    void channelDown() {
        --channel;  
    }


}

// Tv클래스를 상속받은 SmartTv클래스
class SmartTv extends Tv{
    // 멤버: 7개(부모5개+자식2개)
    // 인스턴스 변수: caption(on/off)
    boolean caption;

    // 기본생성자
    SmartTv() {

    }

    // 인스턴스 메서드: 캡션이 on일 때만 매개변수 text를 보여주는 메서드 displayCaption()
    void displayCaption(String text) {
        if(caption) {
            System.out.println(text);//true=on
        }
    }

}
