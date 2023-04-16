import Marvellous.Arithmetic;
import Marvellous.Mathmatics;

public class PackageDemo 
{
    public static void main(String Arg[])
    {
        Arithmetic aobj = new Arithmetic();
        Mathmatics mobj = new Mathmatics();

        int iRet = 0;
        iRet = aobj.Addition(10,11);
        System.out.println("Addition is : "+iRet);

        iRet = aobj.Substraction(10,11);
        System.out.println("Substraction is : "+iRet);

        iRet = mobj.Square(10);
        System.out.println("Square is : "+iRet);

        iRet = mobj.Cube(10);
        System.out.println("Cube is : "+iRet);
    }
}
