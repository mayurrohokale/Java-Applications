import java.util.*;

class ArrayWhile
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the Elements : ");
        
        int iCnt = 0;           // 1
        while(iCnt < iSize)   // 2
        {       
            Arr[iCnt] = sobj.nextInt();     // 4
            iCnt++;   // 3
        }

        System.out.println("Elements of array are : ");

        iCnt = 0;   // 1
        while(iCnt < iSize) // 2
        {
            System.out.println(Arr[iCnt]);  // 4
            iCnt++;     // 3
        }

    }
}