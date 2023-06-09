package pkg2;

import pkg1.MyParent;

class MyChild extends MyParent {
    public void printMembers(){
//        System.out.println(prv); //에러. 같은 클래스만
//        System.out.println(dft); //에러. 같은 클래스+패키지만
        System.out.println(prt);
        System.out.println(pub);
    }
}
public class MyParentTest2 {
    public static void main(String[] args) {
        MyParent mp = new MyParent();

//        System.out.println(mp.prv);
//        System.out.println(mp.dft);
//        System.out.println(mp.prt); //에러. 같은 클래스+패키지+다른패키지의 자손
        System.out.println(mp.pub);
    }
}
