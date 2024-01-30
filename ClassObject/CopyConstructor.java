package ClassObject;

class CopyCon{
    int n,m;
    CopyCon(int n,int m){
        this.n=n;
        this.m=m;
    }
    CopyCon(CopyCon obj){
        n= obj.n;
        m= obj.m;
    }
    void printValues(){
        System.out.println("Data Members:\nN : "+n+"\nM : "+m);
    }
}
public class CopyConstructor {
    public static void main(String[] args) {
        CopyCon obj=new CopyCon(10,20);
        CopyCon obj1=new CopyCon(obj);

        obj.printValues();
        obj1.printValues();
    }
}
