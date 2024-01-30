package ClassObject;


public class ClassDifferentWaysToFind {
    public static void main(String[] args) {

        Class cl1;
        try {
             cl1=Class.forName("java.util.Scanner");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Class cl2=String.class;
        Class cl3=float.class;

        System.out.println("Class represented by cl1 : "+cl1);
        System.out.println("Class represented by: cl2 : "+cl2);
        System.out.println("Class represented by: cl3 : "+cl3);

    }
}
