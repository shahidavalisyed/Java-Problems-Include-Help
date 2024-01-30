package ClassObject;

import java.lang.reflect.Constructor;

public class GetConstructors {
    public static void main(String[] args) throws ClassNotFoundException {
        Class cls=Class.forName("java.lang.Integer");

        Constructor cntr[]=cls.getConstructors();

        for(Constructor c:cntr){
            System.out.println(c);
        }
    }
}
