package ClassObject;

import com.sun.source.util.DocTrees;

public class NewInstanceDemonstration {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        Class obj=Class.forName("NewInstanceDemonstration");
        Object ob=obj.newInstance();

        System.out.println("Class is:"+ob.getClass());


    }
}
