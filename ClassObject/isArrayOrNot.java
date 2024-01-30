package ClassObject;

public class isArrayOrNot {
    public static void main(String[] args) {

        int[] arr=new int[5];

        Class cls1=arr.getClass();
        Class cls2=float.class;

        boolean res1=cls1.isArray();
        boolean res2=cls2.isArray();

        System.out.println("Is "+cls1+" Array ?:"+res1);
        System.out.println("Is "+cls2+" Array ?:"+res2);
    }
}
