package ch6;

public class Ex6_2 {
    public static void main(String[] args) {
        //Tv인스턴스 t1, t2 생성: 참조변수의 선언과 인스턴스 생성 및 연결을 한번에
        Tv t1 = new Tv();
        Tv t2 = new Tv();

        //t1, t2의 channel 출력
        System.out.println("t1.channel: " + t1.channel); //t1.channel: 0
        System.out.println("t2.channel: " + t2.channel); //t2.channel: 0

        //t1의 channel에 7 저장
        t1.channel = 7;

        //+참조변수 t1의 값을 t2에 저장
        t2 = t1;

        //다시 t1, t2의 channel 출력
        System.out.println("t1.channel: " + t1.channel); //t1.channel: 7
        System.out.println("t2.channel: " + t2.channel); //t2.channel: 7


    }
}
