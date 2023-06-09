package ch7;

//TimeTest: 캡슐화와 접근제어자

class Time {
    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour<0 || hour>23){
            return;
        }
        this.hour = hour;
    }
}
public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time();
//        t.hour = 25; //에러. 직접접근불가

        t.setHour(25);
        System.out.println("t.hour: " + t.getHour()); //t.hour: 0

        t.setHour(21);
        System.out.println("t.hour: " + t.getHour()); //t.hour: 21

    }
}
