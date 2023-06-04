package ch6;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

//메서드 생성 및 호출:
// 사칙연산과 관련된 메소드를 가진 MyMath 클래스 생성 후
// 메서드를 사용해보자
public class Ex6_4 {
    public static void main(String[] args) {
        //MyMath의 메소드를 사용하여 5L, 3L에 대한 사칙연산을 수행하기
        //MyMath 인스턴스 생성
        MyMath m = new MyMath();
        long num1 = 5L;
        long num2  = 3L;
        //사칙연산 수행 후 결과 변수에 저장
        long result1 = m.add(num1, num2);
        long result2 = m.subtract(num1, num2);
        long result3 = m.multiply(num1, num2);
        double result4 = m.divide(num1, num2);

        //결과 출력
        System.out.println("result1= " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);

        //추가_두값중 큰값 반환
        long result5 = m.max(333, 13);
        System.out.println("result5 = " + result5);

        //dan에 따라 구구단 출력
        int dan = 3;
        m.printGugudan(dan);

    }

}

// 매개변수(long타입)로 두 값을 받았을 때 사칙연산을 수행하는 메소드를 가진 MyMath 클래스
class MyMath {
    //구구단 출력 메소드
    //2~9단까지만 출력,
    void printGugudan(int dan){
        for (int i = 1; i <= 9 ; i++) {
            if(!(2<=dan&&dan<=9)){
                return; //입력받은 단이 2~9단이 아니면, 메서드 종류 후 돌아가기
            } else {
                System.out.printf("%d * %d = %d%n", dan, i, dan*i);
            }
        }
        return;
    }

    //add 메소드
    long add(long a, long b){
        return a+b;
    }

    //subtract 메소드
    long subtract(long a, long b) {
        return a-b;
    }

    //multiply 메소드
    long multiply(long a, long b) {
        return a * b;
    }

    //divide 메소드
    double divide(double a, double b) {
        return a / b;
    }

    //추가_ 두 값중에 큰 값을 반환하는 메서드 max
    long max(long a, long b) {
//        return a > b ? a : b;
        if(a>b)
            return a;
        else
            return b;

    }
}