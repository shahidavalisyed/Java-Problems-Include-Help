package ClassObject;

class BlockStatic{
    public BlockStatic(){
        System.out.println("Constructor is Excuted :}");
    }
    static {
        System.out.println("Static Block is Excuted :)");
    }

}
public class StaticBlock {
    public static void main(String[] args) {
        new BlockStatic();
    }
}
