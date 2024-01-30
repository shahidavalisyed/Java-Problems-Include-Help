package ClassObject;


import java.util.Scanner;

class AreaOfCircle{
    private float radious=0.0f;
    private float area=0.0f;
    private float perimeter=0.0f;
    public  void readReadious(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radious of a Circle:");
        radious=sc.nextFloat();
    }

    public float getArea() {
        area=(float)Math.PI*radious*radious;
        return area;
    }

    public float getPeremeter() {
        perimeter=2*(float)Math.PI*radious;
        return perimeter;
    }
}
public class Circle {
    public static void main(String[] args) {
        AreaOfCircle area=new AreaOfCircle();

        area.readReadious();
        System.out.println("Area of a Circle:"+area.getArea());
        System.out.println("Peremeter of a Circle is :"+area.getPeremeter());
    }
}
