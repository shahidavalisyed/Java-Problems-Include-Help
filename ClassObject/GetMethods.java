package ClassObject;

import java.lang.reflect.Method;

public class GetMethods {
    public static void main(String[] args) throws ClassNotFoundException {
        Class cls=Class.forName("java.lang.Integer");

        Method ds[]=cls.getMethods();

        System.out.println("List Of methods are:");
        for (Method m:ds)
            System.out.println(m);
    }
}
