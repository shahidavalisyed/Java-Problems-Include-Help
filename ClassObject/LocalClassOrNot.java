package ClassObject;

public class LocalClassOrNot {
    class A{}
    public static void main(String[] args) throws ClassNotFoundException {
        class Local{}
        Class cls1=Class.forName("ClassObject.LocalClassOrNot");
        Class cls2=Local.class;
        Class cls3=LocalClassOrNot.class;
        Class clsA=A.class;


        if(cls1.isLocalClass())
            System.out.println("The cls1 is Representing to Local Class");
        else
            System.out.println("The cls1 is Not Local class");

        if(cls2.isLocalClass())
            System.out.println("The cls2 is Local Class");
        else
            System.out.println("The cls2 is Not Local Class");

        if(cls3.isLocalClass())
            System.out.println("Cls3 is Local Class");
        else
            System.out.println("cls3 is Not Local Class");

        if(clsA.isMemberClass()){
            System.out.println("Yes");
        }else
            System.out.println("NOt");
    }
}
