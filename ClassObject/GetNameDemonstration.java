package ClassObject;

@interface inter{};
public class GetNameDemonstration {
    public static void main(String[] args) {
        Class cls1= inter.class;
        Class cls2= GetNameDemonstration.class;


        System.out.println("The class Name Assoicated with cls1: "+cls1.getName());
        System.out.println("The class Name Assoicated with cls2: "+cls2.getName());
        System.out.println("The class Name Assoicated with cls2: "+cls2.getSimpleName());
    }
}
