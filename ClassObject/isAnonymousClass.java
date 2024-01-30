package ClassObject;

public class isAnonymousClass {
    public static void main(String[] args) {
       Class <? extends  Object > cls=new Object() {}.getClass();
       Class <? extends  Object > cls2=new Object() {}.getClass();
       boolean res=cls2.isAnonymousClass();
       if(res)
           System.out.println("It is a Ananymous Class");
       else
           System.out.println("It is not a Ananymouse Class");

        System.out.println(cls);
        System.out.println(cls2);
    }
}

