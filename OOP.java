
class Arithematic
{
    public int No1;
    public int No2;

    public Arithematic()    //Default Constructor
    {
        System.out.println("Inside Default Constructor ");
        this.No1 = 0;
        this.No2 = 0;
    }
    public Arithematic(int i, int j)    //parameterised constructor
    {
        System.out.println("Inside Parameterised Constructor ");
        this.No1 = i;
        this.No2 = j;
    }

    public int Addition()
    {
        int Ans = 0;
        Ans = this.No1 + this.No2;
        return Ans;
    }
    public int Substraction()
    {
        int Ans = 0;
        Ans = this.No1 - this.No2;
        return Ans;
    }
}

class OOP
{
    public static void main(String Arg[])
    {
        System.out.println("Inside main Function ");

        Arithematic obj1 = new Arithematic();
        Arithematic obj2 = new Arithematic(11, 10);

        int iRet = 0;

        iRet = obj1.Addition();         //0
        System.out.println("Addition is : "+iRet);

        iRet = obj1.Addition();
        System.out.println("Substraction is : "+iRet);  //0
        
        iRet = obj2.Addition();
        System.out.println("Addition is : "+iRet);  //21

        iRet = obj2.Substraction(); //1
        System.out.println("Substraction is : "+iRet);

    }
}

//It just creates the reference not object 
//Arithematic obj;
//obj = new Arithematic();

//Single line object creation

//Arithematic obj = new Arithematic();