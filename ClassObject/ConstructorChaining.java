package ClassObject;


class ChainConstructor{
    int n;
    int m;
    ChainConstructor(){
        this(20);
        System.out.println("Default Constructor Called...");
    }
    ChainConstructor(int n){
        this(n,30);
        System.out.println("In One Argument Constructor Called 1");
    }
    ChainConstructor(int n,int m){
        this.n=n;
        this.m=m;
        System.out.println("In two Argument Constructor Called 2");
    }
    void printValues(){
        System.out.println("Data Members:\nN : "+n+"\nM : "+m);
    }
    ChainConstructor(ChainConstructor obj){
        this.n=obj.n;
        this.m=obj.m;
    }

}
public class ConstructorChaining {
    public static void main(String[] args) {
        ChainConstructor obj=new ChainConstructor();
        ChainConstructor obj1=new ChainConstructor(obj);
        obj.printValues();
        obj1.printValues();
    }
}
