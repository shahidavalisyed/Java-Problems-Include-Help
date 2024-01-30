package ClassObject;

class A{}
public class IsmemberClass {
    class B{}
    public static void main(String[] args) {
        Class clsA=A.class;
        Class clsB=B.class;

        if(clsA.isMemberClass())
            System.out.println("A is Member Class");
        else
            System.out.println("A is Not member class");

        if(clsB.isMemberClass())
            System.out.println("B is Member Class");
        else
            System.out.println("B is Not Member Class");
    }
}
