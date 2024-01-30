package ClassObject;

import java.lang.reflect.Field;

public class GetFields {
    public static void main(String[] args) throws ClassNotFoundException {
        Class cls=Class.forName("java.lang.Double");

        Field fld[]=cls.getFields();

        for(Field f:fld){
            System.out.println(f);
        }
    }
}
