package ClassObject;

class Cascade{

    Cascade method1(){
        System.out.println("Method 1 Excuted");
        return this;
    }
    Cascade method2(){
        System.out.println("Method 2 Excuted");
        return this;
    }
    Cascade method3(){
        System.out.println("Method 3 Excuted");
        return this;
    }
}

public class CascadeWithAnanymousObject {
    public static void main(String[] args) {
        new Cascade().method1().method2().method3();
    }
}
