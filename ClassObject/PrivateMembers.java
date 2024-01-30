package ClassObject;

class Demo{
    private int Num1=10;
    private int Num2=20;

    public void show(){
        System.out.printf("%d\n",Num1);
        System.out.printf("%d\n",Num2);
    }
}
public class PrivateMembers {
    public static void main(String[] args) {
        Demo obj=new Demo();

        obj.show();
    }
}
