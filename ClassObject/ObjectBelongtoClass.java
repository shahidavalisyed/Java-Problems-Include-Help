package ClassObject;

public class ObjectBelongtoClass{
    public static void main(String[] args) throws ClassNotFoundException {
        Class cls=Class.forName("ClassObject.ObjectBelongtoClass");

        ObjectBelongtoClass m=new ObjectBelongtoClass();
        int val=50;

        System.out.println("m instance of ObjectBelongtoClass:"+cls.isInstance(m));
        System.out.println("m instance of ObjectBelongtoClass: "+cls.isInstance(val));
    }

}
