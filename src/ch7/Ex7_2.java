package ch7;

//Ex7_2: 참조변수 super의 사용-부모와 자식의 멤버 이름이 중복될 경우
public class Ex7_2 {
    public static void main(String[] args) {
        Child c = new Child();
        c.method();
    }
}

//부모클래스 Parent
class Parent {
    int x = 10;
}

//자식클래스 Child
class Child extends Parent {
    int x = 20;

    void method() {
        System.out.println("x= "+ x);
        System.out.println("this.x= "+this.x);
        System.out.println("super.x= "+super.x);
    }
}

