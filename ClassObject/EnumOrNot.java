package ClassObject;

enum  Color{
    Red,
    Blue,
    Green,
}
public class EnumOrNot {
    public static void main(String[] args) {

        Class colorCls= Color.class;
        Class enumCls= EnumOrNot.class;

        if(colorCls.isEnum()){
            System.out.println("Color is Enum");
        }else
            System.out.println("Color is Not Enum");

        if(enumCls.isEnum())
            System.out.println("EnumOrNot is Enum");
        else
            System.out.println("EnumOrNot is Not");
    }
}
