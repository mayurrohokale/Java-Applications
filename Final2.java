
class Base
{
    public void fun()
    {
        System.out.println("Base Fun");
    }
    final public void gun()
    {
        System.out.println("Base gun");
    }

}

class Derived extends Base
{
    public void fun()
    {
        System.out.println("Derived Fun");
    }
   /*   public void gun()
    {
        System.out.println("Derived gun");
    }
*/
}
public class Final2 
{
    public static void main(String Arg[])
    {
        Base bobj = new Derived();
        bobj.fun();
        bobj.gun();

    }    
}

