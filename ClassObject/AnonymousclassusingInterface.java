package ClassObject;

interface sample1{
   public void print();
}
class Demo3{
    public void createAnonymousclass(){
        sample1 obj=new sample1() {

            public void print() {
                System.out.println("Inside Anonymous Class");
            }
        };
        obj.print();
    }
}

public class AnonymousclassusingInterface {
    public static void main(String[] args) {
        Demo3 obj=new Demo3();
        obj.createAnonymousclass();
    }
}
