package pkg1;

public class MyParent {
    private int prv;
            int dft;
    protected int prt;
    public int pub;

    public void printMembers(){
        System.out.println(prv);
        System.out.println(dft);
        System.out.println(prt);
        System.out.println(pub);
    }

}
//MyparentTest: 접근제어자 확인
class MyParentTest {
    public static void main(String[] args) {
        MyParent mp = new MyParent();

//        System.out.println(mp.prv); //에러. 접근범위가 맞지 않음
        System.out.println(mp.dft);
        System.out.println(mp.prt);
        System.out.println(mp.pub);
    }
}




