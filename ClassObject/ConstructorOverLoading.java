package ClassObject;

class ConOverloading{
    int n;
    int m;
    ConOverloading(){
        n=10;
        m=20;
    }
    ConOverloading(int n,int m){
        this.n=n;
        this.m=m;
    }
    void printValues(){
        System.out.println("Data Members:");
        System.out.println("N :"+n+"\nM :"+m);
    }
}
public class ConstructorOverLoading {
    public static void main(String[] args) {
        ConOverloading obj=new ConOverloading();
        ConOverloading obj1=new ConOverloading(30,40);

        obj.printValues();
        obj1.printValues();
    }
}
