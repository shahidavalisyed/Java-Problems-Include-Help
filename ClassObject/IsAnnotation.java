package ClassObject;

@interface annotionInterface{}
public class IsAnnotation {
    public static void main(String[] args) {
        Class annotationInterCls=annotionInterface.class;

        if(annotationInterCls.isAnnotation()){
            System.out.println("annotationInterCls is Representing an annotation type");
        }else
            System.out.println("Not an annotation type");
    }
}
