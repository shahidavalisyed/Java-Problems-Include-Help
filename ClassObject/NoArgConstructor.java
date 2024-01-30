package ClassObject;

class Noargs{
    int n;
    int m;
    Noargs(){
      n=10;
      m=20;
    }
    void printValues(){
        System.out.println("N:"+n+"  M:"+m);
    }
}
public class NoArgConstructor {
    public static void main(String[] args) {
        Noargs obj=new Noargs();
        obj.printValues();
    }
}
