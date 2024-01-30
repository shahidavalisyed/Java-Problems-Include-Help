package ClassObject;

class Noaccess{
    int num1=10;
    int num2=20;
    public void show(){
        System.out.println("Num1: "+num1);
        System.out.println("Num2: "+num2);
        num1=30;
        num2=40;
    }
}
public class NoaccessModifier {
    public static void main(String[] args) {
        Noaccess obj=new Noaccess();
        obj.show();
        System.out.println("Num3: "+obj.num1);
        System.out.println("Num2: "+obj.num2);
    }
}
