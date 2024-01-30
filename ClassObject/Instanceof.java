package ClassObject;

public class Instanceof {
    public static void main(String[] args) {
        Instanceof obj=new Instanceof();

        boolean ret=obj instanceof Instanceof;

        if(ret)
            System.out.println("The Object obj is instance of Instanceof class");
        else
            System.out.println("The Object obj is Not an instance of Instanceof class");
    }
}
