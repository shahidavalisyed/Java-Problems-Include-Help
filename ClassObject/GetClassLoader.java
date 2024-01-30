package ClassObject;

public class GetClassLoader {
    public static void main(String[] args) throws ClassNotFoundException {
        Class cls1= GetClassLoader.class;
        Class cls2=Class.forName("java.lang.String");
        Class cls3=int.class;

        System.out.println("Class Loader associted with cls1:"+cls1.getClassLoader());
        System.out.println("Class Loader associted with cls2:"+cls2.getClassLoader());
        System.out.println("Class Loader associted with cls3:"+cls3.getClassLoader());


    }
}
