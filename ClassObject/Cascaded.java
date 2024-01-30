package ClassObject;

class Sample{
    Sample method1(){
        System.out.println("Method1");
        return this;
    }
    Sample method2(){
        System.out.println("Method2");
        return this;
    }
    Sample method3(){
        System.out.println("Method3");
        return this;
    }
}
public class Cascaded {
    public static void main(String[] args) {
        Sample obj=new Sample();
        obj.method1().method2().method3();
    }
}
