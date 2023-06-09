package ch7;

//Ex7_3: 참조변수 super의 사용-부모와 자식의 멤버 이름이 중복되지 않을 경우
public class Ex7_3 {
    public static void main(String[] args) {
        Child2 c = new Child2();
        c.method();
    }
}

class Parent2 {
    int x = 10;
}

class Child2 extends Parent2 {
    void method(){
        System.out.println("x= " + x);
        System.out.println("super.x= "+super.x);
        System.out.println("this.x= "+ this.x);
    }
}
