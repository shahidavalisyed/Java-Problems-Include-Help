package ClassObject;

abstract class Demo1 {
    public  abstract void test(String a);

}

public class AnanyMouse {
    static void m1(String a) {
        System.out.println("string");
    }
    public static void main(String[] args) {
        AnanyMouse da=new AnanyMouse();
        Demo1 d=null;
      d=new Demo1(){
            // super();
            // logic for instance block
            public void test(String a) {
                System.out.println("main");
            }
        };
      d.test("kdj");
      m1("app");
      da.m1("ffj");


    }
}
