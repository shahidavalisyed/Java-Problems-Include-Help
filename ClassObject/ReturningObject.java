package ClassObject;

class Rett{
    public void sayHello(){
        System.out.println("Hello World");
    }
    Rett returnobject(){
        return this;
    }
}
public class ReturningObject {
    public static void main(String[] args) {
        Rett obj1=new Rett();
        Rett obj2=obj1.returnobject();

        obj1.sayHello();
        obj2.sayHello();
    }
}
