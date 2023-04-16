import java.util.*;

class ArrayDowhile
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the Elements : ");
        
        int iCnt = 0;

        do
        {
            Arr[iCnt] = sobj.nextInt();
            iCnt++;
        }while(iCnt < iSize);

        System.out.println("Elements of array are : ");

        iCnt = 0;
        
        do
        {
            System.out.println(Arr[iCnt]);
            iCnt++;
        }while(iCnt < iSize);

    }
}