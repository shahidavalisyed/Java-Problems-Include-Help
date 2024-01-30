package ClassObject;

class Sample1{
    void print(){
        System.out.println("Inside a Sample1 Class");
    }
}
class Demo2{
    void createanonymouseClss(){
        Sample1 obj=new Sample1(){

            void print(){
                System.out.println("Inside anonymouse Class");
            }

        };
        obj.print();
    }
}
public class AnanoyMouseCls {
    public static void main(String[] args) {
        Demo2 obj=new Demo2();
        obj.createanonymouseClss();
    }
}
