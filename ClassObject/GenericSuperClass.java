package ClassObject;

public class GenericSuperClass {
    public static void main(String[] args) throws ClassNotFoundException {
        Class cls1=Class.forName("ClassObject.GenericSuperClass");
        Class cls2=Class.forName("java.util.ArrayList");
        Class cls3=Class.forName("java.lang.Object");

        System.out.println("The Generic SuperClass is :"+cls1.getGenericSuperclass());
        System.out.println("The Generic SuperClass is :"+cls2.getGenericInterfaces());
        System.out.println("The Generic SuperClass is :"+cls3.getGenericSuperclass());
    }
}
