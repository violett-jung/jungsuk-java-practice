package ch6;

// Ex6_3 클래스변수와 인스턴스의 차이 알기
public class Ex6_3 {
    public static void main(String[] args) {
        // Card의 폭과 넓이 출력
        System.out.println("Card.width= " + Card.width);
        System.out.println("Card.height= " + Card.height);

        // Card 객체를 다루기위한 참조변수 c1 선언과 Card 객체 생성 및 연결
        Card c1 = new Card();

        //c1과 연결된 객체의 kind는 Heart, number는 7 저장
        c1.kind = "Heart";
        c1.number = 7;

        // Card 객체를 다루기위한 참조변수 c2 선언과 Card 객체 생성 및 연결
        // c2와 연결된 객체의 kind는 Spade, number는 4 저장
        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        //c1과 c2의 카드 종류와 숫자, 카드폭과 카드 넓이 출력
        System.out.printf("c1의 종류: %s, c1의 숫자: %d, c1의 카드폭: %d, c1의 카드넓이: %d%n", c1.kind, c1.number, Card.width, Card.height);
        System.out.printf("c2의 종류: %s, c2의 숫자: %d, c2의 카드폭: %d, c2의 카드넓이: %d%n", c2.kind, c2.number, Card.width, Card.height);

        //c1과 연결된 객체의 폭 50, 높이 80으로 변경(오해하지 않도록 작성하기)
        Card.width = 50;
        Card.height = 80;

        //c1과 c2의 카드 종류와 숫자, 카드폭과 카드 넓이 출력
        System.out.printf("c1의 종류: %s, c1의 숫자: %d, c1의 카드폭: %d, c1의 카드넓이: %d%n", c1.kind, c1.number, Card.width, Card.height);
        System.out.printf("c2의 종류: %s, c2의 숫자: %d, c2의 카드폭: %d, c2의 카드넓이: %d%n", c2.kind, c2.number, Card.width, Card.height);

    }


}

//속성으로 종류, 숫자, 카드폭, 카드높이를 가진 Card 클래스 생성
class Card{
    //iv 종류, 숫자
    String kind;
    int number;
    //cv 카드폭 100, 카드높이 250
    static int width = 100;
    static int height = 250;
}