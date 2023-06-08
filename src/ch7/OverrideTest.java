package ch7;

// OverrideTest: 오버라이드, 자식 MyPoint3D의 메서드 오버라이드
public class OverrideTest {
    public static void main(String[] args) {
        // MyPoint3D 객체 생성
        MyPoint3D p = new MyPoint3D();
        p.x = 3;
        p.y = 5;
        p.z = 7;
        System.out.println(p.getLocation());
    }
}

// 부모 MyPoint3
class MyPoint3 {
    int x;
    int y;

    String getLocation(){
        return "x:"+x+", y:"+y;
    }

}

// 자식 MyPoint3D
class MyPoint3D extends MyPoint3 {
    int z;

    //조상의 getLocacation() 오버라이드
    String getLocation() {
        return "x:"+x+", y:"+y+", z:"+z;
    }
}


