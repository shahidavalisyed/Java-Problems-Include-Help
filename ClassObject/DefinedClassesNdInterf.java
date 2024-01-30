package ClassObject;

public class DefinedClassesNdInterf {
    public interface DefinedInterf{}
    public class DefinedClass implements DefinedInterf{}


    public static void main(String[] args) {
        Class cls= DefinedClassesNdInterf.class;

        Class clss[]=cls.getClasses();

        System.out.println("Classes and InterFaces are:");
        for(Class f:clss){
            System.out.println(f);
        }
    }

}
