package ch6;

//Ex6_9: 인스턴스 메서드와 static 메서드
public class Ex6_9 {
    public static void main(String[] args) {
        long a= 200L;
        long b = 100L;

        System.out.println(MyMath2.add(a,b));
        System.out.println(MyMath2.subtract(a, b));
        System.out.println(MyMath2.multiply(a, b));
        System.out.println(MyMath2.divide(a,b));


        MyMath2 mm = new MyMath2();
        mm.a = 200L;
        mm.b=100L;
        System.out.println(mm.add());
        System.out.println(mm.subtract());
        System.out.println(mm.multiply());
        System.out.println(mm.divide());
        System.out.println(mm.add2(a,b));
    }
}

class MyMath2 {
    // 인스턴스 변수
    long a, b;

    // 인스턴스 메서드
    long add() {
        return a + b;
    }
    long subtract() {
        return a - b;
    }
    long multiply() {
        return a * b;
    }
    long divide(){
        return a/b;
    }

    long add2(long a, long b){
        return a+b;
    }
    //static 변수

    static long add3(long a, long b) {
        return a+b;
    }

    static long subtract(long a, long b) {
        return a - b;
    }
    static long multiply(long a, long b) {
        return a * b;
    }
    static long divide(long a, long b){
        return a/b;
    }
}
