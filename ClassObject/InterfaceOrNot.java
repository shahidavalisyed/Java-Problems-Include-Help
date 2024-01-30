package ClassObject;

public class InterfaceOrNot {
    public static void main(String[] args) throws ClassNotFoundException {
        Class cls1=Class.forName("ClassObject.Imain");
        Class cls2=Class.forName("java.lang.Runnable");

        boolean res1=cls1.isInterface();
        boolean res2=cls2.isInterface();

        System.out.println("Is InterfaceOrNot :"+res1);
        System.out.println("Is java.lang.Runnable Interface or Not :"+res2);
    }
}
interface Imain{

}