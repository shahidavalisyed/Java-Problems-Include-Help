package ClassObject;
interface A1{}
interface B1{}
public class InterfacesDemo implements A1,B1 {


    public static void main(String[] args) {

       Class cls= InterfacesDemo.class;
       Class clsInf[]=cls.getInterfaces();

        System.out.println("Implemented Interfaces:");
        for(Class iminf:clsInf){
            System.out.println(iminf);
        }

    }
}
