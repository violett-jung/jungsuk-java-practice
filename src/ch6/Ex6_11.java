package ch6;

// Ex6_11: 기본생성자, 매개변수가 있는 생성자
public class Ex6_11 {
    public static void main(String[] args) {
        //Data_1 타입의 객체 생성(참조변수 생성, 객체 생성, 대입)
        Data_1 d1 = new Data_1();

        //Data_2 타입의 객체 생성
        Data_2 d2 = new Data_2();
    }
}

class Data_1 {
    //인스턴스 변수 value
    int value;
}

class Data_2 {
    //인스턴스 변수 value
     int value;

     //매개변수가 있는 생성자
    Data_2(int x){
        //매개변수 x의 값으로 value 초기화
        value = x;
    }

    //기본생성자를 만들어야한다.
    Data_2() {

    }

}