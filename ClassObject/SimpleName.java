package ClassObject;

public class SimpleName {
    public static void main(String[] args) {
        Class cls= SimpleName.class;

        System.out.println("Class Name Associted with cls:"+cls.getName());
        System.out.println("Class Simple Name Associted with cls:"+cls.getSimpleName());
    }
}
