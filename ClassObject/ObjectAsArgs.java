package ClassObject;

class Obj{
    int num;
    void setNum(int n){
        num=n;
    }

    int total(Obj o){
        int t=num+o.num;
        return t;
    }

}
public class ObjectAsArgs {
    public static void main(String[] args) {
        Obj obj1=new Obj();
        Obj obj2=new Obj();

        obj1.setNum(10);
        obj2.setNum(20);

        int total=obj2.total(obj1);

        System.out.println("Total :"+total);
    }
}
