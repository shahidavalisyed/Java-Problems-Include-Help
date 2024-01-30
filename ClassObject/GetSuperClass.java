package ClassObject;

class Asuper{}
class B extends Asuper{}
public class GetSuperClass {
    public static void main(String[] args) {
        Class cls=B.class;
        System.out.println("Super class of B is "+cls.getSigners());
    }
}
