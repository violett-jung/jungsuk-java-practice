package ch6;

public class Ex_6_9_plus {
    public static void main(String[] args) {
        TestClass.staticMethod2();

        TestClass ts = new TestClass();
        ts.instanceMethod2();
    }
}

class TestClass{
    void instanceMethod(){}
    static void staticMethod(){}

    void instanceMethod2(){
        instanceMethod();
        staticMethod();
    }

    static void staticMethod2(){
        staticMethod();
    }
}
