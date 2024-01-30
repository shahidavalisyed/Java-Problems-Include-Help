package ClassObject;


class Arrobject{
    void sayHello(){
        System.out.println("Say hello!");
    }
}
public class ArrayObj {
    public static void main(String[] args) {
        Arrobject[] obj=new Arrobject[3];

        obj[0]=new Arrobject();
        obj[1]=new Arrobject();
        obj[2]=new Arrobject();

        obj[0].sayHello();
        obj[1].sayHello();
        obj[2].sayHello();
    }
}
