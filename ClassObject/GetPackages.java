package ClassObject;

public class GetPackages {
    public static void main(String[] args) throws ClassNotFoundException {
        Class cls1=Class.forName("java.util.ArrayList");
        Class cls2=Class.forName("java.lang.String");
        Class cls3=Class.forName("ClassObject.GetPackages");

        System.out.println("Packages:");
        System.out.println(cls1.getPackageName());
        System.out.println(cls2.getPackageName());
        System.out.println(cls3.getPackageName());

    }
}
