package ClassObject;

class Args{
    int num1;
    int num2;

    Args(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }
    void printvalues(){
        System.out.println("Num1:"+num1+"  Num2:"+num2);
    }
}
public class ArgConstructor {
    public static void main(String[] args) {
        Args obj=new Args(10,20);

        obj.printvalues();
    }
}
