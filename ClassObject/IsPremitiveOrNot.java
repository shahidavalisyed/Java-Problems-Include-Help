package ClassObject;

public class IsPremitiveOrNot {
    public static void main(String[] args) throws ClassNotFoundException {
        Class cls1=int.class;
        Class cls2=Class.forName("ClassObject.IsPremitiveOrNot");

        boolean res1=cls1.isPrimitive();
        boolean res2=cls2.isPrimitive();

        System.out.println("Is "+cls1+" Premitive type :"+res1);
        System.out.println("Is "+cls2+" type :"+res2);
    }
}
