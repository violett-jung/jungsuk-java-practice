package ch7;

//InheritanceTest: 포함관계 강의예제
public class InheritanceTest {
    public static void main(String[] args) {
        //상속관계 InCircle타입 객체 생성
        InCircle ic = new InCircle();
        ic.x = 1;
        ic.y = 2;
        ic.r = 3;
        System.out.println("ic.x = " + ic.x);
        System.out.println("ic.y = " + ic.y);
        System.out.println("ic.r = " + ic.r);

        //포함관계 ComCircle타입 객체 생성
        ComCircle cc = new ComCircle(); //참조변수의 초기화
        cc.c.x = 1;
        cc.c.y = 2;
        cc.r = 3;
        System.out.println("cc.c.x = " + cc.c.x);
        System.out.println("cc.c.y = " + cc.c.y);
        System.out.println("cc.r = " + cc.r);
    }

}

class MyPoint {
    int x;
    int y;
}

//포함관계로 생성
class ComCircle {
    MyPoint c = new MyPoint();
    int r;
}

//상속관계로 생성
class InCircle extends MyPoint {
    int r;
}


